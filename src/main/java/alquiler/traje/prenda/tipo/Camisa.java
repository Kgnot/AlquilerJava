package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.camisa.TiposCamisa;

public class Camisa extends Prenda {
    
    private TiposCamisa tipo;
    public Camisa() {}
    public Camisa(TiposCamisa tipo){
    
        this.tipo = tipo;
    }
    public void setTipo(TiposCamisa tipo) {
    
        this.tipo = tipo;
        
    }
    
    @Override
    public float getPrecio() {
        return 35050;
    }
}
