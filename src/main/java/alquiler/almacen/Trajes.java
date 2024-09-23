package alquiler.almacen;

import alquiler.traje.Traje;

import java.util.ArrayList;

public class Trajes {
    private static ArrayList<Traje> trajes;
    private static Trajes instanciaT;

    private Trajes(){}

    public static Trajes getInstancia(){
        if(instanciaT == null){
            instanciaT = new Trajes();
        }
        return instanciaT;
    }
    public ArrayList<Traje> getListaTrajes(){
        return trajes;
    }

    public void algo(){
        System.out.println("aver");
    }

}
