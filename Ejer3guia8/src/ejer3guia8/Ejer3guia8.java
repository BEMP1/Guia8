package ejer3guia8;

import clase.Carta;
import java.util.ArrayList;

public class Ejer3guia8 {

    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList();
        Carta carta = new Carta();
        int cartasRepartidas;
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 11; i++) {
                baraja.add(carta.crearBaraja(j, i));
            }
        }
        
        carta.barajar(baraja);
        
        System.out.println(baraja.get(5));
        

    }

}
