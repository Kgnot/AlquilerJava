package alquiler.comp.invoice;

import alquiler.comp.Rental;
import alquiler.comp.payment.Payment;
import lombok.Getter;
import lombok.Setter;

public abstract class Invoice {
    @Getter
    private int id;
    @Getter
    @Setter
    private Rental rental;
    @Getter
    @Setter
    private InvoiceState state;
    @Getter
    @Setter
    private String details ="";
    @Getter
    @Setter
    private Payment payment;
    private float total;
    public Invoice(Rental rental) {
        this.rental = rental;
        total = rental.getTotal();
    }
    public float getTotal() {
        total += (total * state.getI());
        return total;
    }
    @Override
    public String toString(){
        return "rental: {" + rental.toString() +" } , "
                + "\npayment: "+payment.getDetails()
                + "\nstate: " + state + " , "
                + "\ntotal: "+ total + " ";
    }

    public abstract void makeInvoice(Invoice invoice);

}
