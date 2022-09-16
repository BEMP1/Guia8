package servicio;

import clase.Cliente;
import clase.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {

    public Cliente crearCliente() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Cliente cliente = new Cliente();
        System.out.println("Ingresar nombre completo");
        cliente.setNombreCompleto(leer.next());
        System.out.println("Ingresar documento");
        cliente.setDocumento(leer.nextInt());
        System.out.println("Ingresar mail");
        cliente.setMail(leer.next());
        System.out.println("Ingresar domicilio");
        cliente.setDomicilio(leer.next());
        System.out.println("Ingresar numero telefonico");
        cliente.setTelefono(leer.nextLong());
        return cliente;
    }

    public void mostrarCliente(ArrayList<Cliente> clientes) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int eleccion;
        int dniCliente;
        boolean encontroCliente;
        if (clientes.isEmpty()) {
            System.out.println("Aun no hay clientes");
        } else {
            do {
                int cont = 0;
                for (Cliente cliente : clientes) {
                    cont = cont + 1;
                    System.out.println("[" + cont + "] " + cliente);
                }
                System.out.println("[1] Mostrar vehiculos de cliente");
                System.out.println("[2] Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese documento del cliente");
                        dniCliente = leer.nextInt();
                        encontroCliente = false;
                        for (Cliente cliente : clientes) {
                            if (dniCliente == cliente.getDocumento()) {
                                mostrarVehiculos(cliente);
                                encontroCliente = true;
                            }
                        }
                        if (encontroCliente = false) {
                            System.out.println("No se encontro a un cliente con ese nombre");
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

    public void mostrarVehiculos(Cliente cliente) {
        if (cliente.getVehiculosPoseidos().isEmpty()) {
            System.out.println("Este cliente no tiene ningun vehiculo");
        } else {
            for (Vehiculo vehiculosPoseido : cliente.getVehiculosPoseidos()) {
                System.out.println(vehiculosPoseido);
            }
        }
    }
}
