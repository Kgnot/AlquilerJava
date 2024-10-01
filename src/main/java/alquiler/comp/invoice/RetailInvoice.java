package alquiler.comp.invoice;

import alquiler.comp.Rental;

public class RetailInvoice extends Invoice{
    public RetailInvoice(Rental rental) {
        super(rental);
    }

    @Override
    public void makeInvoice(Invoice invoice) {
        // Usamos una librería de JasperReport para poder crear nuestra factura
        // JasperReport.createInvoice(invoice);

    }
    @Override
    public String toString(){
        return super.toString()
                + "\nType: Retail";
    }
}
