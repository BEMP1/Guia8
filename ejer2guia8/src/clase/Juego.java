package clase;

import java.util.ArrayList;

public class Juego {

    public ArrayList<Jugador> Jugadores;
    public RevolverDeAgua Revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, RevolverDeAgua Revolver) {
        this.Jugadores = Jugadores;
        this.Revolver = Revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return Revolver;
    }

    public void setRevolver(RevolverDeAgua Revolver) {
        this.Revolver = Revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        Revolver = revolver;
        Jugadores = jugadores;
    }

    public void ronda() {
        
        
        
    }

    @Override
    public String toString() {
        return "Jugadores= " + Jugadores + ", Revolver= " + Revolver;
    }
    
}
