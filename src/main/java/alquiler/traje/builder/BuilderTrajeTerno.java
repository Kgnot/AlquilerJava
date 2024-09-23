package alquiler.traje.builder;

import alquiler.traje.Traje;
import alquiler.traje.prenda.Color.ColorAzul;
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

public class BuilderTrajeTerno extends BuilderTraje {

    public BuilderTrajeTerno(){
        super.traje = new Traje();
    }
    @Override
    public void buildPantalon() {
        traje.setPantalon(new Pantalon(TiposPantalon.ALGODON, new ColorBlanco()));
    }

    @Override
    public void buildSaco() {
        traje.setSaco(new Saco(TiposSacos.BLAZER, new ColorBlanco()));
    }

    @Override
    public void buildCamisa() {
        traje.setCamisa(new Camisa(TiposCamisa.OXFORD, new ColorNegro()));
    }

    @Override
    public void buildZapatos() {
        traje.setZapatos(new Zapatos(TiposZapatos.LEGATE, new ColorAzul()));
    }

    @Override
    public Traje getTraje() {
        return traje;
    }
}
