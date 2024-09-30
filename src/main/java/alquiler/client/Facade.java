package alquiler.client;

import alquiler.comp.Client;
import alquiler.comp.Invoice;
import alquiler.comp.Rental;
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

    public void rentSuit(Client client, SuitType suitType, ArrayList<Accessory> accessories) {
        // Buscamos el suit:
        Suit suit = availabilitySuit.verifyAvailability(suitType);
        if (suit != null) { // Si esta disponible :
            suit.setAccessoryList(accessories); // agregamos los accesorios
            Rental rental = rentalManager.assignSuit(suit, client);  // Creamos la Renta. -> Esta se puede cancelar
            if (validatePayment.verifyPayment()) {      //Validamos el pago
                Invoice invoice = assignmentInvoice.assignInvoice(rental); // creando la factura -> Esta no se puede cancelar
                // Aquí me va a dar todos los detalles de la factura:
                String details = invoice.toString();
                invoice.setDetails(details);
                System.out.println(details);
            } else { //si el pago no es válido entonces me dice no es valido
                rentalManager.deleteRental(rental); // entonces quitamos la renta.
                System.out.println("No es válido el pago.");
            }

        }
    }


}
