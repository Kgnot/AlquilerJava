import alquiler.service.SuitService;
import alquiler.suit.Suit;
import alquiler.suit.builder.SuitBuilder;
import alquiler.suit.builder.TuxedoSuitBuilder;
import alquiler.suit.director.SuitDirector;

import java.util.ArrayList;

public class TestBuider {

    // Apartado para el testing de builder:

    public static void main(String[] args) {
        SuitBuilder builder = new TuxedoSuitBuilder(); // Crearemos esmoquin --
        SuitDirector dt = new SuitDirector(builder); // Instanciamos el director
        Suit t1 = dt.makeTraje(); // creamos el traje, ahora que tiene el traje?
        System.out.println(t1.toString());
        SuitService almacen = SuitService.getInstancia();
        ArrayList<Suit> coll = almacen.getListaTrajes();
        coll.add(t1);
        //El costo:
        System.out.println("Costo: "+t1.getCosto());

    }

}
