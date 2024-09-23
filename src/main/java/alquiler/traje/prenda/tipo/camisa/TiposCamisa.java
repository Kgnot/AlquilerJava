package alquiler.traje.prenda.tipo.camisa;

public enum TiposCamisa {
    
    OXFORD(269000f),POPELINA(209000f),SARGA(350000f);
    private final float precio;

    private TiposCamisa(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
}
