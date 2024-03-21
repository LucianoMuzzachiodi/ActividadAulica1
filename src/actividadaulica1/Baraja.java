
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
}
