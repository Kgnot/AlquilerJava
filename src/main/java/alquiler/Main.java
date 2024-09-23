package alquiler;

import alquiler.almacen.Trajes;
import alquiler.renta.Alquiler;
import alquiler.renta.Cliente;
import alquiler.traje.Traje;
import alquiler.traje.builder.BuilderTraje;
import alquiler.traje.builder.BuilderTrajeEsmoquin;
import alquiler.traje.director.DirectorTraje;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Aqui vendria siendo toda la logica del negocio, y ademas poniendo variables dentro
        // de el builder para tambien, construir de manera manual algun traje
        // Y mediante eso crear los trajes del negocio y ademas darle al cliente
        // la posibilidad de poder ser parte de.
        AgregarPrueba();
        Trajes t = Trajes.getInstancia();
        ArrayList< Traje> almacen = t.getListaTrajes(); // - Aqui tenemos el almacen que ya metimos a un traje, y sera asociado a un cliente
        Cliente C1 = new Cliente("Luis Fernando Diaz","1001884523");
        //agregamos un alquiler al cliente
        Alquiler alquiler= new Alquiler(C1,almacen.get(0), LocalDate.now(), LocalDate.now().plusDays(30));

        C1.agregarAlquiler(alquiler); // Y aqu  i agregamos al alquiler al Cliente

        System.out.println(alquiler.toString());
    }

    public static void AgregarPrueba(){
        BuilderTraje builder = new BuilderTrajeEsmoquin(); // Crearemos esmoquin --
        DirectorTraje dt = new DirectorTraje(builder); // Instanciamos el director
        Traje t1 = dt.makeTraje(); // creamos el traje, ahora que tiene el traje?
        Trajes almacen = Trajes.getInstancia();
        ArrayList<Traje> coll = almacen.getListaTrajes();
        coll.add(t1);
    }

}