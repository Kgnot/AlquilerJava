package alquiler.client;

import alquiler.comp.Client;
import alquiler.comp.Invoice;
import alquiler.comp.Rental;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;
import alquiler.suit.garment.Accessory;

import java.util.ArrayList;

public class RentalFacade {
    private final AvailabilitySuit availabilitySuit;
    private final AssignmentRental assignmentRental;
    private final ValidatePayment validatePayment;
    private final AssignmentInvoice assignmentInvoice;

    public RentalFacade(){
        availabilitySuit = new AvailabilitySuit();
        assignmentRental = new AssignmentRental();
        validatePayment = new ValidatePayment();
        assignmentInvoice = new AssignmentInvoice();
    }

    public void rentSuit(Client client, SuitType suitType, ArrayList<Accessory> accessories){
        // Buscamos el suit:
        Suit suit =availabilitySuit.verifyAvailability(suitType);
        if (suit != null){ // Si esta disponible :
            suit.setAccessoryList(accessories); // agregamos los accesorios
            Rental rental = assignmentRental.assignSuit(suit,client);  // Asignamos el traje
            if(validatePayment.verifyPayment()){      //Validamos el pago
                Invoice invoice = assignmentInvoice.assignInvoice(rental); // creando la factura
                // Aquí me va a dar todos los detalles de la factura:
                String details = invoice.toString();
                invoice.setDetails(details);
                System.out.println(details);
            }
            else{ //si el pago no es válido entonces me dice no es valido
                System.out.println("No es válido el pago.");
            }

        }
    }


}
