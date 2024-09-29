package alquiler.comp;

import alquiler.client.InvoiceState;
import lombok.Getter;
import lombok.Setter;

public class Invoice {
    @Getter
    private int id;
    @Getter
    @Setter
    private Rental rental;
    @Getter
    @Setter
    private InvoiceState state;
    private float total;

    public Invoice(Rental rental) {
        this.rental = rental;
        total = rental.getTotal();
    }

    public float getTotal() {
        total += (total * state.getI());
        return total;
    }

}
