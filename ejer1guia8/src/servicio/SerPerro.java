package servicio;

import clase.Perro;
import java.util.Scanner;

public class SerPerro {

    public Perro crearPerro() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Perro perro = new Perro();
        System.out.println("Ingrese nombre");
        perro.setNombre(leer.next());
        System.out.println("Ingrese raza");
        perro.setRaza(leer.next());
        System.out.println("Ingrese años");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese tamaño en metros");
        perro.setTamanometro(leer.nextDouble());
        return perro;
    }
}
