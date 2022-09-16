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
    
    public void asignarVehiculo(ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculosSinVender) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

}
