package ejer3guia8;

import clase.Carta;
import java.util.ArrayList;

public class Ejer3guia8 {

    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList();
        Carta carta = new Carta();
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 11; i++) {
                baraja.add(carta.crearBaraja(j, i));
            }
        }
        for (Carta carta1 : baraja) {
            System.out.println(carta1);
        }
    }

}
