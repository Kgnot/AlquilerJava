package alquiler.renta;
import alquiler.suit.Suit;
import java.time.LocalDate;


public class Rental {

    private Cliente cliente;
    private Suit suit;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    

    public Rental(Cliente cliente, Suit suit, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.cliente = cliente;
        this.suit = suit;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public Suit getTraje() {
        return suit;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
   public float getCosto() {
        return suit.getCosto();
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "\nCliente=" + cliente.getNombre() + // Supone que Cliente tiene un método getNombre()
                ",\nTraje=" + suit.toString() + // Supone que Traje tiene un método getTipo()
                ",\nFecha de Alquiler=" + fechaAlquiler +
                ",\nFecha de Devolución=" + fechaDevolucion +
                ",\nCosto=" + getCosto() +
                '}';
    }

   
}
