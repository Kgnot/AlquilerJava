package alquiler.comp.payment;

import alquiler.comp.Rental;

public interface Payment {
    boolean processPayment(Rental rental);
    String getDetails();
}
