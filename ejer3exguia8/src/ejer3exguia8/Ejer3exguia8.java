package ejer3exguia8;

import clase.Cliente;
import clase.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioCliente;
import servicio.ServicioVehiculo;

public class Ejer3exguia8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ServicioCliente sercli = new ServicioCliente();
        ServicioVehiculo serveh = new ServicioVehiculo();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Vehiculo> vehiculosSinVender = new ArrayList();
        int cont;
        int eleccion;
        
        do {
            System.out.println("[1] Ingresar cliente");
            System.out.println("[2] Ingresar vehiculo");
            System.out.println("[3] Mostrar Clientes");
            System.out.println("[4] Mostrar vehiculos sin vender");
            System.out.println("[5] Asignar un vehiculo a un cliente");
            System.out.println("[6] Crear poliza");
            System.out.println("[7] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    clientes.add(sercli.crearCliente());
                    break;
                case 2:
                    vehiculosSinVender.add(serveh.crearVehiculo());
                    break;
                case 3:
                    sercli.mostrarCliente(clientes);
                    break;
                case 4:
                    if (vehiculosSinVender.isEmpty()) {
                        System.out.println("Aun no se ingresan vehiculos");
                    } else {
                        cont = 0;
                        for (Vehiculo vehiculo : vehiculosSinVender) {
                            cont = cont + 1;
                            System.out.println("vehiculo " + cont + " " + vehiculo);
                        }
                    }
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Se salio con exito");
                    break;
                default:
                    System.out.println("Numero ingresado no es una opción");
            }
        } while (eleccion != 7);
        
    }
    
}
