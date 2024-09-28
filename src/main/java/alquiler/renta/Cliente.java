package alquiler.renta;

import java.util.ArrayList;

public class Cliente extends Person {
    private ArrayList<Rental> alquileres;

    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
        this.alquileres = new ArrayList<>();
    }

    // Método para agregar un alquiler

    public void agregarAlquiler(Rental rental) {
        alquileres.add(rental);
    }

}
