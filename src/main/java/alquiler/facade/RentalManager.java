package alquiler.facade;

import alquiler.comp.Client;
import alquiler.comp.Rental;
import alquiler.service.RentalService;
import alquiler.suit.Suit;

import java.time.LocalDate;

public class RentalManager {
    private final RentalService rs = RentalService.getInstance();
    final static short MAX = 5;

    public Rental assignSuit(Suit suit, Client client) {
        // Aquí nosotros vamos a asignar los trajes a cada persona y crear lo que es, la renta
        if (client.getRentalList().size() < MAX) {
            return new Rental(client, suit, LocalDate.now(), LocalDate.now().plusDays(30));
        }
        System.out.println("El cliente alcanzo el máximo de trajes"); // Quizá debería ser un JOption ... Toca esperar el visual.
        return null;
    }

    public void deleteRental(Rental rent){
        rs.delete(rent);
    }
}
