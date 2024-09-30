package alquiler;

import alquiler.client.RentalFacade;
import alquiler.comp.Client;
import alquiler.service.SuitService;
import alquiler.suit.Suit;
import alquiler.suit.SuitType;
import alquiler.suit.builder.SuitBuilder;
import alquiler.suit.builder.TernoSuitBuilder;
import alquiler.suit.builder.TuxedoSuitBuilder;
import alquiler.suit.director.SuitDirector;
import alquiler.suit.garment.Accessory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AgregarPruebas(); // agregaremos las pruebas:
        // Crearemos al Cliente:
        Client c1 = new Client("Juan","1000990813");
        RentalFacade facade = new RentalFacade(); // creamos el facade:
        // Que traje escoge? : Un Smoking:
        ArrayList<Accessory> ac = new ArrayList<>();
        facade.rentSuit(c1, SuitType.TUXEDO,null);

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