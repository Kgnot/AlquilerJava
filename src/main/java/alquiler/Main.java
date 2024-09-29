package alquiler;

import alquiler.service.SuitService;
import alquiler.comp.Rental;
import alquiler.comp.Client;
import alquiler.suit.Suit;
import alquiler.suit.builder.SuitBuilder;
import alquiler.suit.builder.TuxedoSuitBuilder;
import alquiler.suit.director.SuitDirector;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
  /*  public static void main(String[] args) {
        // Aqui vendria siendo toda la logica del negocio, y ademas poniendo variables dentro
        // de el builder para tambien, construir de manera manual algun traje
        // Y mediante eso crear los trajes del negocio y ademas darle al cliente
        // la posibilidad de poder ser parte de.
        AgregarPrueba();
        SuitService t = SuitService.getInstancia();
        ArrayList<Suit> almacen = t.getListaTrajes(); // - Aqui tenemos el almacen que ya metimos a un traje, y sera asociado a un cliente
        Client C1 = new Client("Luis Fernando Diaz","1001884523");
        //agregamos un alquiler al cliente
        Rental rental = new Rental(C1,almacen.get(0), LocalDate.now(), LocalDate.now().plusDays(30));

        C1.addRental(rental); // Y aqu  i agregamos al alquiler al Cliente

        System.out.println(rental.toString());
    }

    public static void AgregarPrueba(){
        SuitBuilder builder = new TuxedoSuitBuilder(); // Crearemos esmoquin --
        SuitDirector dt = new SuitDirector(builder); // Instanciamos el director
        Suit t1 = dt.makeTraje(); // creamos el traje, ahora que tiene el traje?
        SuitService almacen = SuitService.getInstancia();
        ArrayList<Suit> coll = almacen.getListaTrajes();
        coll.add(t1);
    }
*/
}