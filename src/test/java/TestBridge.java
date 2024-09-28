import alquiler.suit.garment.complex.Shirt;
import alquiler.suit.garment.complex.shirt.ShirtType;

import java.awt.*;

public class TestBridge {

    public static void main(String[] args) {

    // para probar el bridge solo crearemos camisas de diferentes colores:
        Shirt c = new Shirt(ShirtType.POPELINA, Color.BLUE);
        Shirt c2 = new Shirt(ShirtType.OXFORD,Color.WHITE);

        System.out.println(c.toString());
        System.out.println(c2.toString());


    }


}
