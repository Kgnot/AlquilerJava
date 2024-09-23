package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Color.Color;
import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.zapatos.TiposZapatos;

public class Zapatos extends Prenda {
    private TiposZapatos tipo;
    public Zapatos(TiposZapatos tipo,Color color) {
        this.tipo = tipo;
        super.color = color;
    }
    public void setColor(Color color){
        super.color = color;
    }
    public void setTipo(TiposZapatos tipo) {
        this.tipo = tipo;
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
