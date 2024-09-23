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
        return builder.getTraje();
    }

}
