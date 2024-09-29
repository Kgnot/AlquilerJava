package alquiler.client;

import alquiler.suit.State;
import alquiler.suit.Suit;

public class AvailabilitySuit {

    boolean verifyAvailability(Suit suit){
        return suit.getState().equals(State.AVAILABLE);
    }
}
