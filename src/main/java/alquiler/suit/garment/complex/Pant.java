package alquiler.suit.garment.complex;

import alquiler.suit.garment.ComplexGarment;
import alquiler.suit.garment.complex.pant.PantType;

import java.awt.*;
import java.util.ArrayList;

public class Pant extends ComplexGarment {

    private PantType tipo;

    public Pant(PantType tipo, Color color) {
        this.tipo = tipo;
        super.color = color;
        super.garmentList = new ArrayList<>();
        super.price = tipo.getPrice();
    }

    public Pant(PantType tipo) {
        this.tipo = tipo;
        super.garmentList = new ArrayList<>();
        super.price = tipo.getPrice();

    }

    public Pant() {
        super.garmentList = new ArrayList<>();
    }

    public void setTipo(PantType tipo) {
        this.tipo = tipo;
        super.price = tipo.getPrice();
    }

    @Override
    public String toString() {
        return "\nTipo: " + tipo.name() +
                "\nColor: " + color.toString() +
                "\nPrecio: " + getPrice();

    }
}
