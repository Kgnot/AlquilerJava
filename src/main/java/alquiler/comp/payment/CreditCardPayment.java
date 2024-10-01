package alquiler.comp.payment;

import alquiler.comp.Rental;

public class CreditCardPayment implements Payment{
    @Override
    public boolean processPayment(Rental rental) {

        //Seguir tutorial para:
        //https://community.developer.visa.com/t5/Tutorials/HelloWorld-java-How-to-run-Java-Sample-Code-using-the-Hello/bc-p/19194#M93

        return false;
    }

    @Override
    public String getDetails(){
        return "Tarjeta Crédito ";// + los detalles que podemos sacar de la Api por documentación
    }

}
