package alquiler.comp.payment;

import alquiler.comp.Rental;

public class PayPalPayment implements Payment {
    @Override
    public boolean processPayment(Rental rental) {
        // Aqui tambien implementariamos una api que se conecta a Paypal
        /*
        * Similar a:
        *
        TransactionRequest request = new TransactionRequest()
       .amount(request.queryParams("amount"))
       .paymentMethodNonce(request.queryParams("paymentMethodNonce"))
       .deviceData(request.queryParams("device_data"))
       .orderId("Mapped to PayPal Invoice Number")
       .options()
         .submitForSettlement(true)
         .paypal()
           .customField("PayPal custom field")
           .description("Description for PayPal email receipt")
           .done()
         .storeInVaultOnSuccess(true)
         .done();
         Result<Transaction> saleResult = gateway.transaction().sale(request);
         return result.isSuccess();
        * */
        return true;
    }

    @Override
    public String getDetails(){
        return "Paypal:  ";// + los detalles que podemos sacar de la Api por documentación
    }
}
