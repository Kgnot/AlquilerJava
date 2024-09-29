package alquiler.client;

import alquiler.service.SuitService;
import alquiler.suit.State;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;

public class AvailabilitySuit {

    Suit verifyAvailability(SuitType suit){
        return SuitService.getInstancia().getSuitType(suit);
    }
}
