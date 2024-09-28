package alquiler.suit.builder;

import alquiler.suit.Suit;

public abstract class SuitBuilder {
    protected Suit suit;
    public abstract void buildPant();
    public abstract void buildJacket();
    public abstract void buildShirt();
    public abstract void buildShoes();
    public abstract Suit getTraje();
}
