package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Color.Color;
import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.Acomponente.ComponentePrenda;
import alquiler.traje.prenda.tipo.Acomponente.Parte;
import alquiler.traje.prenda.tipo.Acomponente.ParteIndividual;
import alquiler.traje.prenda.tipo.saco.TiposSacos;
import lombok.Getter;
import lombok.Setter;
public class Saco extends Prenda {

    @Setter
    private TiposSacos tipo;
    private ComponentePrenda componente;

    public Saco(TiposSacos tipo, Color color){
        this.tipo = tipo;
        super.color = color;
    }
    public void setColor(Color color){
        super.color = color;
    }


    public void setComponente(Parte comp){
        this.componente = new ParteIndividual(comp);
    }

    @Override
    public float getPrecio() {
        return tipo.getPrecio()+(componente == null?0:componente.getPrecio());
    }
    @Override
    public String toPrendaString(){
        return "\nTipo: "+tipo.name()+
                "\nColor: "+color.getColor()+
                "\ncomponente: "+(componente==null?"no hay componentes":componente.mostrar())+
                "\nPrecio: "+getPrecio();

    }
}
