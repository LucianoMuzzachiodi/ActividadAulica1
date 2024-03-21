
package actividadaulica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
    private List<Carta> cartas;
    private List<Carta> cartasRepartidas;

    public Baraja() {
        cartas = new ArrayList<>();
        cartasRepartidas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Carta carta = cartas.remove(0);
        cartasRepartidas.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                mano.add(carta);
            } else {
                break; // No hay más cartas
            }
        }
        return mano;
    }

    public void cartasMonton() {
        if (cartasRepartidas.isEmpty()) {
            System.out.println("Aún no se han repartido cartas.");
        } else {
            System.out.println("Cartas repartidas:");
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas sin repartir:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}