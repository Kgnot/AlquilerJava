package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Color.Color;
import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.camisa.TiposCamisa;

public class Camisa extends Prenda {
    
    private TiposCamisa tipo;
    public Camisa(TiposCamisa tipo, Color color){
        super.color = color;
        this.tipo = tipo;
    }
    public void setTipo(TiposCamisa tipo) {
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
