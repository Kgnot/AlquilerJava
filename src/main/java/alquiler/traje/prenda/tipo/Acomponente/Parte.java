package alquiler.traje.prenda.tipo.Acomponente;

public enum Parte {
    PANUELO(2500),BOTON(700);

    private final float precio;
    private Parte(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

}
