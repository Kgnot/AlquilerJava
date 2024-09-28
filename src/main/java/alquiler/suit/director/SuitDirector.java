package alquiler.suit.director;

import alquiler.suit.Suit;
import alquiler.suit.builder.SuitBuilder;

public class SuitDirector {
    private SuitBuilder builder;
    public SuitDirector(SuitBuilder builder){
        this.builder = builder;
    }
    public void setBuilder(SuitBuilder bd){
        this.builder = bd;
    }
    public Suit makeTraje(){
        builder.buildShirt();
        builder.buildPant();
        builder.buildJacket();
        builder.buildShoes();
        return builder.getTraje();
    }
}
