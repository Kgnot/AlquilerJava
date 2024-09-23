package alquiler.traje.prenda.tipo.zapatos;

public enum TiposZapatos {
    LEGATE(300500f), SEMIBROGUE(255000f), BROGUE(150500f), DERBY(200000f), CROMWELL(150000f), GRAFTON(75000f);
    private final float precio;

    private TiposZapatos(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}
