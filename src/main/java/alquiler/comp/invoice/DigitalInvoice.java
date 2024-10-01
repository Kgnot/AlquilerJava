package alquiler.comp.invoice;

import alquiler.comp.Rental;

public class DigitalInvoice extends Invoice{


    public DigitalInvoice(Rental rental) {
        super(rental);
    }

    @Override
    public void makeInvoice(Invoice invoice) {
        //Implementamos el Api para enviar un String de la factura al Correo.
    }

    @Override
    public String toString(){
        return super.toString()
                + "\nType: Retail";
    }

}
