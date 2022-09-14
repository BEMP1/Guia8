package clase;

import java.net.URL;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

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
        boolean alguienMojado = false;
        do {
            for (Jugador Jugadore : Jugadores) {
                System.out.println("Turno de " + Jugadore.getNombre());
                Jugadore.setMojado(Revolver.mojar());
                alguienMojado = Revolver.mojar();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                if (alguienMojado) {
                    System.out.println("BAM");
                    java.awt.Toolkit.getDefaultToolkit().beep(); //solo funciona si el beep predeterminado es cambiado por un sonido de bala
                    break;
                }
                System.out.println("Click");
                Revolver.siguienteChorro();
            }
        } while (!alguienMojado);
        for (Jugador Jugadore : Jugadores) {
            if (Jugadore.getMojado()) {
                System.out.println(Jugadore + " fue mojado");
            }
        }
    }

    @Override
    public String toString() {
        return "Jugadores= " + Jugadores + ", Revolver= " + Revolver;
    }

}
