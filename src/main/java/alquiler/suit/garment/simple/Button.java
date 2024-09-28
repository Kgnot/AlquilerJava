package alquiler.suit.garment.simple;

import alquiler.suit.garment.SimpleGarment;

import java.awt.*;

public class Button extends SimpleGarment {

    private final float price = 700;

    public Button(Color color) {
        super.price = price;
        super.color = color;
    }
}
