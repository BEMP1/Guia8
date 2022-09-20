package servicio;

import clase.Vehiculo;
import java.util.ArrayList;
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

    public void removerVehiculo(ArrayList<Vehiculo> vehiculos) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int eleccion;
        int numVehiculo;
        if (vehiculos.isEmpty()) {
            System.out.println("Aun no hay vehiculos");
        } else {
            int cont;
            do {
                cont = 1;
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println(cont + " " + vehiculo);
                    cont++;
                }
                System.out.println("[1] Remover vehiculo");
                System.out.println("[2] Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese numero de vehiculo");
                        numVehiculo = leer.nextInt() - 1;
                        if (vehiculos.get(numVehiculo) == null) {
                            System.out.println("No se encontro a un vehiculo con ese nombre");
                        } else {
                            vehiculos.remove(numVehiculo);
                        }
                        break;
                    case 2:
                        System.out.println("Se salio con exito");
                        break;
                    default:
                        System.out.println("Numero ingresado no es una opción");
                }
            } while (eleccion != 2);
        }
    }

}
