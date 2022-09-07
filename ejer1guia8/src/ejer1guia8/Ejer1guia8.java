package ejer1guia8;

import servicio.SerPersona;
import clase.Persona;
import java.util.ArrayList;

public class Ejer1guia8 {

    public static void main(String[] args) {
        SerPersona serper = new SerPersona();
        ArrayList<Persona> gente = new ArrayList();
        for (int i = 0; i < 2; i++) {
            gente.add(serper.crearPersona());
        }
        for (Persona persona : gente) {
            System.out.println(persona);
        }
    }

}
