package clase;

public class Persona {

    public String nombre;
    public String apellido;
    public int edadanio;
    public int documento;
    public Perro perro;

    public Persona(String nombre, String apellido, int edadanio, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edadanio = edadanio;
        this.documento = documento;
        this.perro = perro;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadanio() {
        return edadanio;
    }

    public void setEdadanio(int edadanio) {
        this.edadanio = edadanio;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edadanio + ", documento=" + documento + ", perro ( " + perro + ")";
    }

}
