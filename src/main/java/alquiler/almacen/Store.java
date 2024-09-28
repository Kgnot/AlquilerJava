package alquiler.almacen;

import alquiler.suit.Suit;

import java.util.ArrayList;

public class Store {
    private static ArrayList<Suit> suits;
    private static Store instanciaT;

    private Store(){
        suits = new ArrayList<>();
    }

    public static Store getInstancia(){
        if(instanciaT == null){
            instanciaT = new Store();
        }
        return instanciaT;
    }
    public ArrayList<Suit> getListaTrajes(){
        return suits;
    }

    public void algo(){
        System.out.println("aver");
    }

}
