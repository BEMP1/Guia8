package clase;

import java.util.Random;

public class RevolverDeAgua {

    public int posicionActual;
    public int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        Random rand = new Random();
        posicionActual = rand.nextInt(6) + 1;
        posicionAgua = rand.nextInt(6) + 1;
    }

    public boolean mojar() {
        boolean mojado = false;
        if (posicionActual == posicionAgua) {
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro() {
        if (posicionActual==6) {
            posicionActual=1;
        } else {
            posicionActual=posicionActual+1;
        }
    }

    @Override
    public String toString() {
        return "Revolver De Agua " + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    

}
