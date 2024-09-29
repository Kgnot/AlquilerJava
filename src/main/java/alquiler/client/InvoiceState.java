package alquiler.client;

import alquiler.service.InvoiceService;
import lombok.Getter;

@Getter
public enum InvoiceState {
    PAID(0),OVERDUE(0.08f),PENDING(0); // Pagada, cancelada o pendiente ;
    private final float i;
    private InvoiceState(float f){
        this.i = f;
    }
}
