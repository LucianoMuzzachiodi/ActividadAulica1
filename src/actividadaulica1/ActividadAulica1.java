
package actividadaulica1;

import java.util.Scanner;


public class ActividadAulica1 {

    
    public static void main(String[] args) {

       int opcion = 0;
        Baraja baraja=new Baraja();
        do{
            System.out.println("\n");
        System.out.println("Elija una opción:\n"
                + "1: Barajar cartas\n"
                + "2:Siguiente carta\n"
                + "3: Mostrar cartas disponibles\n"
                + "4:Dar cartas\n"
                + "5:Mostrar cartas que salieron\n"
                + "6:Mostrar baraja\n"
                + "7 Terminar de jugar\n");
        Scanner leer= new Scanner(System.in);
        opcion= leer.nextInt();
        switch(opcion){
            case 1:{System.out.println("[Cartas barajadas]");
            baraja.barajar();}
            break;
            case 2:{System.out.println("[Sacando una carta]");
                System.out.println(baraja.siguienteCarta());}
            
            break;
            case 3:{System.out.println("[Las cartas disponibles son: ]");
                System.out.println(baraja.cartasDisponibles());}
            
            break;
            case 4:{System.out.println("[Ingrese la cantidad de cartas que quiera que se le repartan]");
           int cantidad=leer.nextInt();
                System.out.println(baraja.darCartas(cantidad));}
            break;
            case 5:{
            baraja.cartasMonton();}
            case 6: {System.out.println("[Las cartas que no se han sacado son:]");
            baraja.cartasDisponibles();}
            break;
            case 7:opcion=7;
            
            
        }
        }while(opcion!=7);
        System.out.println("A finalizado el juego!");  
    }
}