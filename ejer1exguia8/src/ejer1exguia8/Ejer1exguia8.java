package ejer1exguia8;

import clase.Perro;
import clase.Persona;
import java.util.ArrayList;
import servicio.SerPerro;
import servicio.SerPersona;

public class Ejer1exguia8 {

    public static void main(String[] args) {
        SerPersona serper = new SerPersona();
        SerPerro serprr = new SerPerro();
        ArrayList<Perro> jauria = new ArrayList();
        for (int i = 0; i < 2; i++) {
            jauria.add(serprr.crearPerro());
        }
        ArrayList<Persona> gente = new ArrayList();
        for (int i = 0; i < 2; i++) {
            gente.add(serper.crearPersona(jauria));
        }
        for (Persona persona : gente) {
            System.out.println(persona);
        }
    }

}
