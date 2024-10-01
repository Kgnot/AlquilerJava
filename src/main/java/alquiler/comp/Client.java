package alquiler.comp;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Client extends Person {
    private final ArrayList<Rental> rentalList;

    public Client(String nombre, String cedula, String email) {
        super(nombre, cedula,email);
        this.rentalList = new ArrayList<>();
    }

    // Método para agregar un alquiler
    public void addRental(Rental rental) {
        rentalList.add(rental);
    }


}
