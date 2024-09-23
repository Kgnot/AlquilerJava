package alquiler.renta;
import alquiler.traje.Traje;
import java.time.LocalDate;


public class Alquiler {

    private Cliente cliente;
    private Traje traje;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    

    public Alquiler(Cliente cliente, Traje traje, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.cliente = cliente;
        this.traje = traje;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public Traje getTraje() {
        return traje;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
   public float getCosto() {
        return traje.getCosto();  
    }
   
}
