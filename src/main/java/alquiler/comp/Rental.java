package alquiler.comp;
import alquiler.suit.Suit;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class Rental {

    private Client client;
    private ArrayList<Suit> suitList;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    public Rental(Client client, Suit suitList, LocalDate rentalDate, LocalDate returnDate) {
        this.client = client;
        this.suitList.add(suitList);
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }


   public float getTotal() {
        float total = 0;
        for(Suit s : suitList){
            total+=s.getCosto();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "\nCliente=" + client.getName() + // Supone que Cliente tiene un método getNombre()
                ",\nTraje=" + suitList.toString() + // Supone que Traje tiene un método getTipo()
                ",\nFecha de Alquiler=" + rentalDate +
                ",\nFecha de Devolución=" + returnDate +
                ",\nCosto=" + getTotal() +
                '}';
    }

   
}
