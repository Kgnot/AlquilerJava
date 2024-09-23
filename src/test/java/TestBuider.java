import alquiler.almacen.Trajes;
import alquiler.traje.Traje;
import alquiler.traje.builder.BuilderTraje;
import alquiler.traje.builder.BuilderTrajeEsmoquin;
import alquiler.traje.director.DirectorTraje;

import java.util.ArrayList;

public class TestBuider {

    // Apartado para el testing de builder:

    public static void main(String[] args) {
        BuilderTraje builder = new BuilderTrajeEsmoquin(); // Crearemos esmoquin --
        DirectorTraje dt = new DirectorTraje(builder); // Instanciamos el director
        Traje t1 = dt.makeTraje(); // creamos el traje, ahora que tiene el traje?
        System.out.println(t1.toString());
        Trajes almacen = Trajes.getInstancia();
        ArrayList<Traje> coll = almacen.getListaTrajes();
        coll.add(t1);
        //El costo:
        System.out.println("Costo: "+t1.getCosto());

    }

}
