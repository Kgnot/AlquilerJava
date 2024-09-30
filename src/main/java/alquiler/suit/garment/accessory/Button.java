package alquiler.suit.garment.accessory;

import alquiler.suit.garment.Accessory;

import java.awt.*;

public class Button extends Accessory {

    private final float price = 700;

    public Button(Color color) {
        super.n = "Botón";
        super.price = price;
        super.color = color;
    }
}
