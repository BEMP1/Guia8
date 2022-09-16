package servicio;

import clase.Vehiculo;
import java.util.Scanner;

public class ServicioVehiculo {

    public Vehiculo crearVehiculo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese marca");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese modelo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese año");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese numero de motor");
        vehiculo.setNumMotor(leer.next());
        System.out.println("Ingrese chasis");
        vehiculo.setChasis(leer.next());
        System.out.println("Ingrese color");
        vehiculo.setColor(leer.next());
        System.out.println("Ingrese tipo");
        vehiculo.setTipo(leer.next());
        return vehiculo;
    }

}
