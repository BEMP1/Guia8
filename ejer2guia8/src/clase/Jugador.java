package clase;

public class Jugador {

    public Integer id;
    public String Nombre;
    public Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String Nombre, Boolean mojado) {
        this.id = id;
        this.Nombre = Nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo() {
        RevolverDeAgua rev = new RevolverDeAgua();
        if (rev.mojar()) {
            mojado = true;
        }
        return mojado;
    }

}
