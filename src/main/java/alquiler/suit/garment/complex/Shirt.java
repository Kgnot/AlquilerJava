package alquiler.suit.garment.complex;

import alquiler.suit.garment.ComplexGarment;
import alquiler.suit.garment.complex.shirt.ShirtType;

import java.awt.*;
import java.util.ArrayList;

public class Shirt extends ComplexGarment {

    private ShirtType type;

    public Shirt() {
        super.garmentList = new ArrayList<>();
    }

    public Shirt(ShirtType type) {
        this.type = type;
        super.garmentList = new ArrayList<>();
        super.price = type.getPrice();
    }

    public Shirt(ShirtType type, Color color) {
        this.type = type;
        super.garmentList = new ArrayList<>();
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
                "\nColor: " + color.toString() +
                "\nPrecio: " + getPrice();
    }
}
