
package actividadaulica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
     private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
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
        return cartas.remove(0);
    }
    
    public int cartasDisponibles() {
        return cartas.size();
    }
     
    public List<Carta> darCartas(int cantidad) {
        List<Carta> cartasADar = new ArrayList<>();
        if (cartasDisponibles() >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                cartasADar.add(siguienteCarta());
            }
        } else {
            System.out.println("No hay suficientes cartas en la baraja para dar.");
        }
        return cartasADar;
    }

    public void cartasMonton() {
        if (cartas.isEmpty()) {
            System.out.println("No ha salido ninguna carta del montón.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan más cartas en la baraja.");
        } else {
            System.out.println("Cartas restantes en la baraja:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }
}
