import alquiler.facade.Facade;
import alquiler.comp.Client;
import alquiler.service.SuitService;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;
import alquiler.suit.builder.SuitBuilder;
import alquiler.suit.builder.TernoSuitBuilder;
import alquiler.suit.builder.TuxedoSuitBuilder;
import alquiler.suit.director.SuitDirector;
import alquiler.suit.garment.Accessory;
import alquiler.suit.garment.accessory.Belt;
import alquiler.suit.garment.accessory.Button;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestFacade {

    public static void main(String[] args) {
        AgregarPruebas(); // agregaremos las pruebas:
        // Crearemos al Cliente:
        Client c1 = new Client("Juan","1000990813","juanemail@email.com");
        Facade facade = new Facade(); // creamos el facade:
        // Que traje escoge? -> Un Smoking: y paga con? -> Efectivo : Tipo de factura? : Digital
        // PAGO: 2-> credito | 3-> paypal | default -> efectivo
        //FACTURA:  1-> fisico | default -> virtual

        ArrayList<Accessory> accessories = new ArrayList<>(Arrays.asList(
                new Belt(Color.gray),
                new Button(Color.DARK_GRAY)
        ));


        facade.rentSuit(c1, SuitType.TUXEDO,accessories,1,1); // Este seria como el testing de Facade

    }

    public static void AgregarPruebas(){
        SuitBuilder builder = new TuxedoSuitBuilder(); // Crearemos esmoquin --
        SuitBuilder builder2 = new TernoSuitBuilder();
        SuitDirector dt = new SuitDirector(builder); // Instanciamos el director
        Suit t1 = dt.makeTraje(); // creamos el traje.
        dt.setBuilder(builder2);
        Suit t2 = dt.makeTraje();


        SuitService almacen = SuitService.getInstancia();
        ArrayList<Suit> coll = almacen.getAll();
        coll.add(t1);
        for(int i = 0; i < 200;i++){
            coll.add(t1.suitClone());
            coll.add(t2.suitClone());
        }


    }
}
