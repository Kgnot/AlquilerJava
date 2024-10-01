package alquiler.facade;

import alquiler.comp.Rental;
import alquiler.comp.payment.CashPayment;
import alquiler.comp.payment.CreditCardPayment;
import alquiler.comp.payment.PayPalPayment;
import alquiler.comp.payment.Payment;

public class ValidatePayment {

    public Payment verifyPayment(Rental rental, int c) {
        Payment payment;

        switch (c) {
            case 2 -> payment = new CreditCardPayment();
            case 3 -> payment = new PayPalPayment();
            default -> payment = new CashPayment();
        }

        return payment; // Retorna el objeto Payment correspondiente
    }
}
