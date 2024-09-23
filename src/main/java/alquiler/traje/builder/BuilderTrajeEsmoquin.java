package alquiler.traje.builder;

import alquiler.traje.Traje;

public class BuilderTrajeEsmoquin extends BuilderTraje{
    public BuilderTrajeEsmoquin(){
        super.traje = new Traje();
    }
    @Override
    public void buildPantalon() {

    }

    @Override
    public void buildSaco() {

    }

    @Override
    public void buildCamisa() {

    }

    @Override
    public void buildZapatos() {

    }

    @Override
    public Traje getTraje() {
        return null;
    }
}
