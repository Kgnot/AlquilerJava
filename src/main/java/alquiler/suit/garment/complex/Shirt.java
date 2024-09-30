package alquiler.suit.garment.complex;

import alquiler.suit.garment.ComplexGarment;
import alquiler.suit.garment.complex.shirt.ShirtType;

import java.awt.*;
import java.util.ArrayList;

public class Shirt extends ComplexGarment {

    private ShirtType type;

    public Shirt() {
    }

    public Shirt(ShirtType type) {
        this.type = type;
        super.price = type.getPrice();
    }

    public Shirt(ShirtType type, Color color) {
        this.type = type;
        super.color = color;
        super.price = type.getPrice();

    }

    @Override
    public float getPrice() {
        return type.getPrice();
    }

    public void setType(ShirtType type) {
        this.type = type;
        super.price = type.getPrice();
    }

    @Override
    public String toString() {
        return "\nTipo: " + type.name() +
                "\nColor: " + super.color.toString() +
                "\nPrecio: " + getPrice();
    }
}
