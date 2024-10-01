package alquiler.facade;

import alquiler.comp.invoice.DigitalInvoice;
import alquiler.comp.invoice.Invoice;
import alquiler.comp.invoice.InvoiceState;
import alquiler.comp.Rental;
import alquiler.comp.invoice.RetailInvoice;
import alquiler.service.InvoiceService;

public class AssignmentInvoice {

    public AssignmentInvoice() {

    }

    public Invoice assignInvoice(Rental rental, int typeInvoice) {
        InvoiceService is = InvoiceService.getInstance();
        Invoice newInvoice = typeInvoice(rental,typeInvoice);
        newInvoice.setState(InvoiceState.PAID);
        is.add(newInvoice);

        return newInvoice;
    }

    private Invoice typeInvoice(Rental rental,int type){
        switch (type){
            case 1 -> {
                return new RetailInvoice(rental);
            }
            default -> {
                return new DigitalInvoice(rental);
            }
        }
    }
}
