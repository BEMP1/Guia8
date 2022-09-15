
package clase;

import java.util.ArrayList;


public class Cliente {
    public String nombreCompleto;
    public int documento;
    public String mail;
    public String domicilio;
    public long telefono;
    public ArrayList<Vehiculo> vehiculosPoseidos;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, int documento, String mail, String domicilio, long telefono, ArrayList<Vehiculo> vehiculosPoseidos) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.vehiculosPoseidos = vehiculosPoseidos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculosPoseidos() {
        return vehiculosPoseidos;
    }

    public void setVehiculosPoseidos(ArrayList<Vehiculo> vehiculosPoseidos) {
        this.vehiculosPoseidos = vehiculosPoseidos;
    }
    
    
    
}
