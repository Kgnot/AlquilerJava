package alquiler.comp.payment;

import alquiler.comp.Rental;

public class CashPayment implements Payment{
    @Override
    public boolean processPayment(Rental rental) {
        //Si es cashPayment es un proceso que espera una respuesta de quien atiende ¿Si pagó completo?

        return true;
    }

    @Override
    public String getDetails(){
        return "En efectivo";
    }
}
