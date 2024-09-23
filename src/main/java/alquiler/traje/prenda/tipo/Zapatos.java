package alquiler.traje.prenda.tipo;

import alquiler.traje.prenda.Prenda;
import alquiler.traje.prenda.tipo.zapatos.TiposZapatos;

public class Zapatos extends Prenda {
    private TiposZapatos tipo;
    public Zapatos() {}
    public Zapatos(TiposZapatos tipo) {
        this.tipo = tipo;
    }
    public void setTipo(TiposZapatos tipo) {
        this.tipo = tipo;
    }
    @Override
    public float getPrecio() {
        return tipo.getPrecio();
    }
}
