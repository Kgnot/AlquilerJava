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
        this.suitList = new ArrayList<>();
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

    public String listToString(){
        String str ="";
        for(Suit s : suitList){
            str += s.toString() +"\n";
        }
        return str;
    }

    @Override
    public String toString() {
        return "rent{" +
                "\nclient:" + client.getName() + // Supone que Cliente tiene un método getNombre()
                ",\nsuit:" + listToString() + // Supone que Traje tiene un método getTipo()
                ",\nrentalDate:" + rentalDate +
                ",\nreturnDate:" + returnDate +
                ",\ntotal : " + getTotal() +
                '}';
    }

   
}
