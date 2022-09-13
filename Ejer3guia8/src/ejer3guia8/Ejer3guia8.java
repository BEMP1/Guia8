package ejer3guia8;

import clase.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer3guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Carta> baraja = new ArrayList();
        Carta carta = new Carta();
        ArrayList<Carta> barajadada = new ArrayList();
        int eleccion;
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 11; i++) {
                baraja.add(carta.crearBaraja(j, i));
            }
        }
        do {
            System.out.println("MENU");
            System.out.println("[1] Barajar");
            System.out.println("[2] Siguiente carta");
            System.out.println("[3] Cartas disponibles");
            System.out.println("[4] Dar cartas");
            System.out.println("[5] Cartas monton");
            System.out.println("[6] Mostrar baraja");
            System.out.println("[7] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    for (Carta carta1 : barajadada) {
                        baraja.add(carta1);
                    }
                    barajadada.clear();
                    carta.barajar(baraja);
                    break;
                case 2:
                    carta.siguienteCarta(baraja, barajadada);
                    break;
                case 3:
                    System.out.println("El numero de cartas que quedan es" + baraja.size());
                    break;
                case 4:
                    carta.darCarta(baraja, barajadada);
                    break;
                case 5:
                    if (barajadada.isEmpty()) {
                        System.out.println("No hay cartas en el monton");
                    } else {
                        for (Carta carta2 : barajadada) {
                            System.out.println(carta2);
                        }
                    }
                    break;
                case 6:
                    if (baraja.isEmpty()) {
                        System.out.println("No quedan cartas");
                    } else {
                        for (Carta carta1 : baraja) {
                            System.out.println(carta1);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Se salio con exito");
                    break;
                default:
                    System.out.println("Numero no esta entre las opciones");

            }
        } while (eleccion != 7);
    }
}
