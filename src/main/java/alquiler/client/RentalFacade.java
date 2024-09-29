package alquiler.client;

import alquiler.comp.Client;
import alquiler.comp.Rental;
import alquiler.suit.Suit;

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

    public void rentSuit(Client client, Suit suit){
        if (availabilitySuit.verifyAvailability(suit)){ // Si esta disponible :
            Rental rental = assignmentRental.assignSuit(suit,client);  // Asignamos el traje
            if(validatePayment.verifyPayment()){      //Validamos el pago
                assignmentInvoice.assignInvoice(rental); // creando la factura
            }
            else{ //si el pago no es válido entonces me dice no es valido
                System.out.println("No es válido el pago.");
            }

        }
    }
}
