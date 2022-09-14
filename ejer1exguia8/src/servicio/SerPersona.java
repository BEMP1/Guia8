package servicio;

import clase.Perro;
import clase.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class SerPersona {

    public Persona crearPersona(ArrayList<Perro> jauria) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Persona persona = new Persona();
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese años");
        persona.setEdadanio(leer.nextInt());
        System.out.println("Ingrese documento");
        persona.setDocumento(leer.nextInt());
        System.out.println("Eliga un perro");
        for (Object object : jauria) {
            System.out.println(object);
        }
        int eleccion;
        boolean adopto = false;
        do {
            eleccion = leer.nextInt() - 1;
            for (int i = 0; i < 2; i++) {
                if (eleccion == i && jauria.get(i).getAdoptado().equals("No")) {
                    persona.setPerro(jauria.get(i));
                    jauria.get(i).setAdoptado("Si");
                    adopto = true;
                }
            }
        } while (adopto != true);
        return persona;
    }
}
