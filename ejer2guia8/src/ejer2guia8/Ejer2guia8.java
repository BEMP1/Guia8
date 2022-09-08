package ejer2guia8;

import clase.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Jugador jugador = new Jugador();
        ArrayList <Jugador> jugadores = new ArrayList(); 
        int cantidadJugadores;
        System.out.println("¿Cuantos jugadores van a ser?, Entre 1 y 6");
        do {
            System.out.println("Ingrese cantidad de jugadores");
            cantidadJugadores = leer.nextInt();
        } while (cantidadJugadores>6 || cantidadJugadores<1);
        for (int i = 0; i < cantidadJugadores; i++) {
            jugadores.add(jugador.creadorJugadores(i));
        }

    }

}
