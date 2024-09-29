package alquiler.client;

import alquiler.comp.Invoice;
import alquiler.comp.Rental;
import alquiler.service.InvoiceService;

public class AssignmentInvoice {

    public AssignmentInvoice(){

    }
    public Invoice assignInvoice(Rental rental){
        InvoiceService is =  InvoiceService.getInstance();
        Invoice newInvoice = new Invoice(rental);
        newInvoice.setState(InvoiceState.PAID);
        is.add(newInvoice);

        return newInvoice;
    }
}
