package alquiler.traje.builder;

import alquiler.traje.Traje;

public abstract class BuilderTraje {
    protected Traje traje;

    public abstract void buildPantalon();
    public abstract void buildSaco();
    public abstract void buildCamisa();
    public abstract void buildZapatos();

    public abstract Traje getTraje();
}
