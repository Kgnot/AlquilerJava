package alquiler.service;

import alquiler.comp.invoice.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService implements Service<Invoice> {

    private static InvoiceService instance;
    private final List<Invoice> invoiceList;

    private InvoiceService(){
        invoiceList = new ArrayList<>();
    }

    //Methods
    public static InvoiceService getInstance(){
        if(instance == null){
            instance = new InvoiceService();
        }
        return instance;
    }


    @Override
    public void add(Invoice obj) {
        boolean added = invoiceList.add(obj);
        System.out.println(added ? "Añadido" : "No añadido");

    }

    @Override
    public Invoice get(int g) {
        return invoiceList.get(g);
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceList;
    }

    @Override
    public Invoice delete(Invoice obj) {
        boolean deleted = invoiceList.remove(obj);
        return deleted? obj:null;
    }
}
