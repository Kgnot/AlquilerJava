package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Color.Color;
import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.pantalon.TiposPantalon;

public class Pantalon extends Prenda {

    private TiposPantalon tipo;
    public Pantalon (TiposPantalon tipo, Color color){
        this.tipo = tipo;
        super.color = color;
    }
    public void setTipo(TiposPantalon tipo){
        this.tipo = tipo;
    }
    public void setColor(Color color){
        super.color = color;
    }
    
    @Override
    public float getPrecio() {
        return tipo.getPrecio();
    }
    @Override
    public String toPrendaString(){
        return "\nTipo: "+tipo.name()+
                "\nColor: "+color.getColor()+
                "\nPrecio: "+getPrecio();

    }
}
