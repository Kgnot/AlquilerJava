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

public class TuxedoSuitBuilder extends SuitBuilder {
    public TuxedoSuitBuilder(){
        super.suit = new Suit();
    }
    @Override
    public void buildPant() {
        suit.setPant(new Pant(PantType.WOOL, Color.BLACK));
    }
    @Override
    public void buildJacket() {
        suit.setJacket(new Jacket(JacketType.TUXEDO, Color.BLACK));
    }
    @Override
    public void buildShirt() {
        suit.setShirt(new Shirt(ShirtType.POPELINA,  Color.WHITE));
    }
    @Override
    public void buildShoes() {
        suit.setShoes(new Shoes(ShoesType.CROMWELL, Color.BLACK));
    }
    @Override
    public Suit getTraje() {
        return suit;
    }
}
