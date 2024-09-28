package alquiler.suit.garment.simple;

import alquiler.suit.garment.SimpleGarment;

import java.awt.*;

public class PocketSquare extends SimpleGarment {

    private final float price = 1500;

    public PocketSquare(Color color) {
        super.price = price;
        super.color = color;
    }
}
