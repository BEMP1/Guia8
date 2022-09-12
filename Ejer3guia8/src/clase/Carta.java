package clase;

public class Carta {

    public int numero;
    public String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta numero " + numero + ", palo " + palo + '}';
    }

    public Carta crearBaraja(int j, int i) {
        Carta carta = new Carta();
        switch (i) {
            case 1:
                carta.setNumero(i);
                break;
            case 2:
                carta.setNumero(i);
                break;
            case 3:
                carta.setNumero(i);
                break;
            case 4:
                carta.setNumero(i);
                break;
            case 5:
                carta.setNumero(i);
                break;
            case 6:
                carta.setNumero(i);
                break;
            case 7:
                carta.setNumero(i);
                break;
            case 8:
                carta.setNumero(10);
                break;
            case 9:
                carta.setNumero(11);
                break;
            case 10:
                carta.setNumero(12);
                break;
            default:
                throw new AssertionError();
        }
        switch (j) {
            case 0:
                carta.setPalo("Espada");
                break;
            case 1:
                carta.setPalo("Basto");
                break;
            case 2:
                carta.setPalo("Oro");
                break;
            case 3:
                carta.setPalo("Copa");
                break;
            default:
                throw new AssertionError();

        }
        return carta;
    }
}
