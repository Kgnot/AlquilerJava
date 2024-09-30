package alquiler.service;

import alquiler.comp.Rental;

import java.util.ArrayList;
import java.util.List;

public class RentalService implements Service<Rental> {

    private static RentalService instance;
    private final List<Rental> rentalList;

    private RentalService(){
        rentalList = new ArrayList<>();
    }
    // Methods
    public static RentalService getInstance(){
        if(instance == null){
            instance = new RentalService();
        }
        return instance;
    }

    @Override
    public void add(Rental obj) {
        boolean added = rentalList.add(obj);
        System.out.println(added?"Añadido":"no añadido");
    }

    @Override
    public Rental get(int g) {
        return rentalList.get(g);
    }

    @Override
    public List<Rental> getAll() {
        return rentalList;
    }

    @Override
    public Rental delete(Rental obj) {
       boolean deleted = rentalList.remove(obj);
       return deleted?obj:null;
    }
}
