package alquiler.traje.builder;

import alquiler.traje.Traje;
import alquiler.traje.prenda.tipo.Camisa;
import alquiler.traje.prenda.tipo.Pantalon;
import alquiler.traje.prenda.tipo.Saco;
import alquiler.traje.prenda.tipo.Zapatos;
import alquiler.traje.prenda.tipo.zapatos.TiposZapatos;

public class BuilderTrajeChaque extends BuilderTraje{
    public BuilderTrajeChaque(){
        super.traje = new Traje();
    }
    @Override
    public void buildPantalon() {
        traje.setPantalon(new Pantalon());
    }

    @Override
    public void buildSaco() {
        traje.setSaco(new Saco());
    }

    @Override
    public void buildCamisa() {
        traje.setCamisa(new Camisa());
    }

    @Override
    public void buildZapatos() {
        traje.setZapatos(new Zapatos(TiposZapatos.CROMWELL));
    }

    @Override
    public Traje getTraje() {
        return traje;
    }
}
