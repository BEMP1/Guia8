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
        cliente.setVehiculosPoseidos(new ArrayList());
        return cliente;
    }

    public void mostrarCliente(ArrayList<Cliente> clientes) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int eleccion;
        int numCliente;
        if (clientes.isEmpty()) {
            System.out.println("Aun no hay clientes");
        } else {
            int cont = 1;
            do {
                for (Cliente cliente : clientes) {
                    System.out.println(cont + " " + cliente);
                    cont++;
                }
                System.out.println("[1] Mostrar vehiculos de cliente");
                System.out.println("[2] Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese numero de cliente");
                        numCliente = leer.nextInt() - 1;
                        if (clientes.get(numCliente) == null) {
                            System.out.println("No se encontro a un cliente con ese nombre");
                        } else {
                            mostrarVehiculos(clientes.get(numCliente));
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

    public void removerCliente(ArrayList<Cliente> clientes) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int eleccion;
        int numCliente;
        if (clientes.isEmpty()) {
            System.out.println("Aun no hay clientes");
        } else {
            int cont = 1;
            do {
                for (Cliente cliente : clientes) {
                    System.out.println(cont + " " + cliente);
                    cont++;
                }
                System.out.println("[1] Remover cliente");
                System.out.println("[2] Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese numero de cliente");
                        numCliente = leer.nextInt() - 1;
                        if (clientes.get(numCliente) == null) {
                            System.out.println("No se encontro a un cliente con ese nombre");
                        } else {
                            clientes.remove(numCliente);
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

    public void asignarVehiculo(ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculos) {
        if (clientes.isEmpty() || vehiculos.isEmpty()) {
            if (clientes.isEmpty()) {
                System.out.println("Aun no ingresa clientes");
            }
            if (vehiculos.isEmpty()) {
                System.out.println("Aun no ingresa vehiculos");
            }
            return;
        }
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Clientes:");
        int eleccion;
        int cont;
        int numCliente;
        int numVehiculo;
        do {
            cont=1;
            for (Cliente cliente : clientes) {
                System.out.println(cont + " " + cliente);
                cont++;
            }
            System.out.println("[1] eliga cliente");
            System.out.println("[2] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese numero de cliente");
                    numCliente = leer.nextInt() - 1;
                    if (clientes.get(numCliente) == null) {
                        System.out.println("No se encontro a un cliente con ese nombre");
                    } else {
                        do {
                            cont=1;
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
                    break;
                case 2:
                    System.out.println("Se salio con exito");
                    break;
                default:
                    System.out.println("Numero ingresado no es una opción");
            }
        } while (eleccion != 2);

        cont = 1;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("vehiculo " + cont + " " + vehiculo);
            cont++;
        }
    }
}
