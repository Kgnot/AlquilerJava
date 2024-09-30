package alquiler.suit.garment.complex;

import alquiler.suit.garment.ComplexGarment;
import alquiler.suit.garment.complex.jacket.JacketType;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

public class Jacket extends ComplexGarment {
    @Setter
    private JacketType tipo;
    private float price;

    public Jacket(JacketType tipo, Color color) {
        this.tipo = tipo;
        super.color = color;
        super.price = tipo.getPrice();
    }

    public Jacket(JacketType tipo) {
        this.tipo = tipo;
        super.price = tipo.getPrice();
    }

    public Jacket() {
    }

    @Override
    public float getPrice() {
        return tipo.getPrice();
    }

    public void setColor(Color color) {
        super.color = color;
    }

    @Override
    public String toString() {
        return "\nTipo: " + tipo.name() +
                "\nColor: " + super.color.toString() +
                "\nPrecio: " + getPrice();
    }


}
