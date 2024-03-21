
package actividadaulica1;


public class ActividadAulica1 {

    
    public static void main(String[] args) {
         Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Siguiente carta: " + baraja.siguienteCarta());

        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Dando 5 cartas:");
        System.out.println(baraja.darCartas(5));

        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());

        baraja.cartasMonton();

        baraja.mostrarBaraja();
    }
}
