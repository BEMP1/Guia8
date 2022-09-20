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
            System.out.println("[3] Remover cliente");
            System.out.println("[4] Remover vehiculo");
            System.out.println("[5] Mostrar Clientes");
            System.out.println("[6] Mostrar vehiculos sin vender");
            System.out.println("[7] Asignar un vehiculo a un cliente");
            System.out.println("[8] Crear poliza");
            System.out.println("[9] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    clientes.add(sercli.crearCliente());
                    break;
                case 2:
                    vehiculosSinVender.add(serveh.crearVehiculo());
                    break;
                case 3:
                    sercli.removerCliente(clientes);
                    break;
                case 4:
                    serveh.removerVehiculo(vehiculosSinVender);
                    break;
                case 5:
                    sercli.mostrarCliente(clientes);
                    break;
                case 6:
                    if (vehiculosSinVender.isEmpty()) {
                        System.out.println("Aun no se ingresan vehiculos");
                    } else {
                        cont = 1;
                        for (Vehiculo vehiculo : vehiculosSinVender) {
                            System.out.println("vehiculo " + cont + " " + vehiculo);
                            cont++;
                        }
                    }
                    break;
                case 7:
                    sercli.asignarVehiculo(clientes, vehiculosSinVender);
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("Se salio con exito");
                    break;
                default:
                    System.out.println("Numero ingresado no es una opción");
            }
        } while (eleccion != 9);
        
    }
    
}
