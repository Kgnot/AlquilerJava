package alquiler.renta;

import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Alquiler> alquileres;

        public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
        this.alquileres = new ArrayList<>();
    }

    // Método para agregar un alquiler
        
    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }
}
