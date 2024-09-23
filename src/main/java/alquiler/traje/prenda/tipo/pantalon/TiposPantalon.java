package alquiler.traje.prenda.tipo.pantalon;

public enum TiposPantalon {
    
    LANA(249000f),ALGODON(249000f),LINO(249000f);
    private final float precio;

    private TiposPantalon(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}
