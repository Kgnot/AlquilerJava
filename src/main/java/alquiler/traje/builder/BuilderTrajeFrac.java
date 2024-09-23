package alquiler.traje.builder;

import alquiler.traje.Traje;
import alquiler.traje.prenda.Color.ColorBlanco;
import alquiler.traje.prenda.Color.ColorNegro;
import alquiler.traje.prenda.tipo.Camisa;
import alquiler.traje.prenda.tipo.Pantalon;
import alquiler.traje.prenda.tipo.Saco;
import alquiler.traje.prenda.tipo.Zapatos;
import alquiler.traje.prenda.tipo.camisa.TiposCamisa;
import alquiler.traje.prenda.tipo.pantalon.TiposPantalon;
import alquiler.traje.prenda.tipo.saco.TiposSacos;
import alquiler.traje.prenda.tipo.zapatos.TiposZapatos;

public class BuilderTrajeFrac extends BuilderTraje{

    public BuilderTrajeFrac(){
        super.traje = new Traje();
    }

    @Override
    public void buildPantalon() {
        traje.setPantalon(new Pantalon(TiposPantalon.LANA,new ColorNegro()));
    }

    @Override
    public void buildSaco() {
        traje.setSaco(new Saco(TiposSacos.DEPORTIVO,new ColorNegro()));
    }

    @Override
    public void buildCamisa() {
        traje.setCamisa(new Camisa(TiposCamisa.POPELINA,new ColorBlanco()));
    }

    @Override
    public void buildZapatos() {
        traje.setZapatos(new Zapatos(TiposZapatos.BROGUE, new ColorNegro()));
    }

    @Override
    public Traje getTraje() {
        return traje;
    }
}
