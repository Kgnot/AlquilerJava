package alquiler.facade;

import alquiler.comp.Client;
import alquiler.comp.invoice.Invoice;
import alquiler.comp.Rental;
import alquiler.comp.payment.Payment;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;
import alquiler.suit.garment.Accessory;

import java.util.ArrayList;

public class Facade {
    private final AvailabilitySuit availabilitySuit;
    private final RentalManager rentalManager;
    private final ValidatePayment validatePayment;
    private final AssignmentInvoice assignmentInvoice;

    public Facade() {
        availabilitySuit = new AvailabilitySuit();
        rentalManager = new RentalManager();
        validatePayment = new ValidatePayment();
        assignmentInvoice = new AssignmentInvoice();
    }

    public void rentSuit(Client client, SuitType suitType, ArrayList<Accessory> accessories, int typeInvoice, int typePayment) {
        // Buscamos el traje:
        Suit suit = availabilitySuit.verifyAvailability(suitType);

        if (suit != null) { // Si está disponible:
            suit.setAccessoryList(accessories); // agregamos los accesorios
            Rental rental = rentalManager.assignSuit(suit, client);  // Creamos la renta -> Esta se puede cancelar

            // Validamos el pago y asignamos el tipo de pago
            Payment payment = validatePayment.verifyPayment(rental, typePayment);

            if (payment != null && payment.processPayment(rental)) {  // Validamos el pago y lo procesamos
                Invoice invoice = assignmentInvoice.assignInvoice(rental, typeInvoice); // creando la factura -> Esta no se puede cancelar
                invoice.setPayment(payment);
                // Aquí me va a dar todos los detalles de la factura:
                String details = invoice.toString();
                invoice.setDetails(details);
                System.out.println(details);
            } else { // Si el pago no es válido entonces me dice que no es válido
                rentalManager.deleteRental(rental); // Quitamos la renta.
                System.out.println("No es válido el pago.");
            }
        }
    }



}
