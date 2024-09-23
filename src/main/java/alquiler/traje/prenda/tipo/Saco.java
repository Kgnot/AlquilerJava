package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.saco.TiposSacos;

public class Saco extends Prenda {
    
    private TiposSacos tipo;
    public Saco(){}
    public Saco(TiposSacos tipo){
    
        this.tipo = tipo;
        
    }
    public void setTipo(TiposSacos tipo){
    
        this.tipo = tipo;
    
    }
    
    @Override
    public float getPrecio() {
        return tipo.getPrecio();
    }
}
