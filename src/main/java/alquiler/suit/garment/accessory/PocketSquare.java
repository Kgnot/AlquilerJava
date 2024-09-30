package alquiler.suit.garment.accessory;

import alquiler.suit.garment.Accessory;

import java.awt.*;

public class PocketSquare extends Accessory {

    private final float price = 1500;

    public PocketSquare(Color color) {
        super.n = "Pañuelo";
        super.price = price;
        super.color = color;
    }
}
