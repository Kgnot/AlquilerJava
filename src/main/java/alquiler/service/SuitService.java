package alquiler.service;

import alquiler.suit.State;
import alquiler.suit.Suit;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SuitService implements Service<Suit> {
    private static ArrayList<Suit> suitList;
    private static SuitService instanciaT;

    private SuitService(){
        suitList = new ArrayList<>();
    }

    public static SuitService getInstancia(){
        if(instanciaT == null){
            instanciaT = new SuitService();
        }
        return instanciaT;
    }
    @Override
    public void add(Suit obj) {
        boolean added = suitList.add(obj);
        System.out.println(added ? "Se añadió":"no se añadió");
    }

    @Override
    public Suit get(int g) {
        return suitList.get(g);
    }

    @Override
    public ArrayList<Suit> getAll() {
        return suitList;
    }

    @Override
    public Suit delete(Suit obj) {
        boolean deleted = suitList.remove(obj);
        return deleted?obj:null;
    }

    // Métodos Propios
    public ArrayList<Suit> getAvailabilitySuits(){
        return suitList.stream().
                filter( c -> c.getState().equals(State.AVAILABLE))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
