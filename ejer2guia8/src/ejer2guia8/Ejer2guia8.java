package ejer2guia8;

import clase.Juego;
import clase.Jugador;
import java.util.ArrayList;
import java.util.Scanner;
import clase.RevolverDeAgua;

public class Ejer2guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Jugador jugador = new Jugador();
        RevolverDeAgua revolver = new RevolverDeAgua();
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        int cantidadJugadores;
        System.out.println("¿Cuantos jugadores van a ser?, Entre 1 y 6");
        do {
            System.out.println("Ingrese cantidad de jugadores");
            cantidadJugadores = leer.nextInt();
        } while (cantidadJugadores > 6 || cantidadJugadores < 1);
        for (int i = 0; i < cantidadJugadores; i++) {
            jugadores.add(jugador.creadorJugadores(i));
        }
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        System.out.println(juego);
        
    }

}
