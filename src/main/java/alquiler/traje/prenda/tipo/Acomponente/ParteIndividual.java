package alquiler.traje.prenda.tipo.Acomponente;

public class ParteIndividual implements ComponentePrenda{
    private Parte tipo;
    @Override
    public String mostrar() {
        return tipo.name();
    }

    @Override
    public float getPrecio() {
        return tipo.getPrecio();
    }

}
