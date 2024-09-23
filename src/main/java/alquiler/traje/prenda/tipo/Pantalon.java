package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.pantalon.TiposPantalon;

public class Pantalon extends Prenda {

    private TiposPantalon tipo;
    public Pantalon() {}
    public Pantalon (TiposPantalon tipo){
    
        this.tipo = tipo;
        
    }
    public void setTipo(TiposPantalon tipo){
    
        this.tipo = tipo;
    
    }
    
    @Override
    public float getPrecio() {
        return tipo.getPrecio();
    }
}
