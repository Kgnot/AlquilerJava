package alquiler.suit.garment.complex;

import alquiler.suit.garment.ComplexGarment;
import alquiler.suit.garment.complex.shoes.ShoesType;

import java.awt.*;
import java.util.ArrayList;

public class Shoes extends ComplexGarment {
    private ShoesType type;
    public Shoes(ShoesType type) {
        this.type = type;
        super.price = type.getPrice(); // El precio del Zapato
    }
    public Shoes(ShoesType type, Color color) {
        this.type = type;
        super.color = color;
        super.price = type.getPrice(); // El precio del Zapato
    }
    public Shoes(){
    }
    public void setType(ShoesType shoesType){
        this.type = shoesType;
        super.price = type.getPrice(); // El precio del Zapato

    }
    @Override
    public String toString(){
        return "\nTipo: "+ type.name()+
                "\nColor: "+super.color.toString()+
                "\nPrecio: "+ getPrice();
    }
}
