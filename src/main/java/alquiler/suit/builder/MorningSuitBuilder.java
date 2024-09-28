package alquiler.suit.builder;

import alquiler.suit.Suit;
import alquiler.suit.garment.complex.Shirt;
import alquiler.suit.garment.complex.Pant;
import alquiler.suit.garment.complex.Jacket;
import alquiler.suit.garment.complex.Shoes;
import alquiler.suit.garment.complex.shirt.ShirtType;
import alquiler.suit.garment.complex.pant.PantType;
import alquiler.suit.garment.complex.jacket.JacketType;
import alquiler.suit.garment.complex.shoes.ShoesType;

import java.awt.*;

public class MorningSuitBuilder extends SuitBuilder {
    public MorningSuitBuilder(){
        super.suit = new Suit();
    }
    @Override
    public void buildPant() {
        suit.setPant(new Pant(PantType.LINEN, Color.BLUE));
    }

    @Override
    public void buildJacket() {
        suit.setJacket(new Jacket(JacketType.BASIC,  Color.BLUE));
    }

    @Override
    public void buildShirt() {
        suit.setShirt(new Shirt(ShirtType.SARGA,  Color.BLUE));
    }

    @Override
    public void buildShoes() {
        suit.setShoes(new Shoes(ShoesType.CROMWELL, Color.BLUE));
    }

    @Override
    public Suit getTraje() {
        return suit;
    }
}
