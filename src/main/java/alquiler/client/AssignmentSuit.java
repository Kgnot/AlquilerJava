package alquiler.client;

import alquiler.comp.Client;
import alquiler.comp.Rental;
import alquiler.service.RentalService;
import alquiler.suit.Suit;

import java.time.LocalDate;

public class AssignmentSuit {
    public void assignSuit(Suit suit, Client client){
        // Aquí nosotros vamos a asignar los trajes a cada persona y crear lo que es, la renta
        RentalService rs =  RentalService.getInstance();
        Rental newRenta = new Rental(client,suit, LocalDate.now(), LocalDate.now().plusDays(30)); // Las rentas serán de 30 Días. Siempre
    }
}
