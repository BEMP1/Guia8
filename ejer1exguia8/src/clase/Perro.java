package clase;

public class Perro {

    public String nombre;
    public String raza;
    public int edad;
    public Double tamanometro;
    public String adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, Double tamanometro, String adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanometro = tamanometro;
        this.adoptado = adoptado;
    }

    public String getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(String adoptado) {
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getTamanometro() {
        return tamanometro;
    }

    public void setTamanometro(Double tamanometro) {
        this.tamanometro = tamanometro;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + ", raza " + raza + ", edad " + edad + ", tamaño " + tamanometro + "m,  adoptado=" + adoptado;
    }

}
