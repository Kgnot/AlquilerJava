package alquiler.traje.prenda;

import alquiler.traje.prenda.Color.Color;

public abstract class Prenda {
    protected Color color;
    public abstract float getPrecio();
    public Color getColor(){
        return color;
    }

   public abstract String toPrendaString();

}
