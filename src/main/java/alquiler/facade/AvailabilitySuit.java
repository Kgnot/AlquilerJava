package alquiler.facade;

import alquiler.service.SuitService;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;

public class AvailabilitySuit {

    public Suit verifyAvailability(SuitType suit){
        return SuitService.getInstancia().findSuitType(suit);
    }
}
