package alquiler.suit.builder;

import alquiler.suit.Suit;
import alquiler.suit.SuitType;
import alquiler.suit.garment.complex.Shirt;
import alquiler.suit.garment.complex.Pant;
import alquiler.suit.garment.complex.Jacket;
import alquiler.suit.garment.complex.Shoes;
import alquiler.suit.garment.complex.shirt.ShirtType;
import alquiler.suit.garment.complex.pant.PantType;
import alquiler.suit.garment.complex.jacket.JacketType;
import alquiler.suit.garment.complex.shoes.ShoesType;

import java.awt.*;

public class TailcoatSuitBuilder extends SuitBuilder {

    public TailcoatSuitBuilder(){
        super.suit = new Suit();
        super.suit.setSuitType(SuitType.TAILCOAT);

    }

    @Override
    public void buildPant() {
        suit.setPant(new Pant(PantType.WOOL,Color.BLACK));
    }

    @Override
    public void buildJacket() {
        suit.setJacket(new Jacket(JacketType.SPORT, Color.BLACK));
    }

    @Override
    public void buildShirt() {
        suit.setShirt(new Shirt(ShirtType.POPELINA,Color.WHITE));
    }

    @Override
    public void buildShoes() {
        suit.setShoes(new Shoes(ShoesType.BROGUE, Color.BLACK));
    }

    @Override
    public Suit getTraje() {
        return suit;
    }
}
