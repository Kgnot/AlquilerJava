package alquiler.traje.director;

import alquiler.traje.Traje;
import alquiler.traje.builder.BuilderTraje;

public class DirectorTraje {
    private BuilderTraje builder;

    public DirectorTraje(BuilderTraje builder){
        this.builder = builder;
    }

    public void setBuilder(BuilderTraje bd){
        this.builder = bd;
    }

    public Traje makeTraje(){
        builder.buildCamisa();
        builder.buildPantalon();
        builder.buildSaco();
        builder.buildZapatos();
        return builder.getTraje();
    }

}
