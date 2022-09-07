package servicio;

import clase.Persona;
import java.util.Scanner;

public class SerPersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Persona persona = new Persona();
        SerPerro perro = new SerPerro();
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese años");
        persona.setEdadanio(leer.nextInt());
        System.out.println("Ingrese documento");
        persona.setDocumento(leer.nextInt());
        System.out.println("Ingrese perro");
        persona.setPerro(perro.crearPerro());
        return persona;
    }
}
