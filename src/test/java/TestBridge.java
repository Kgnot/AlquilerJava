import alquiler.traje.prenda.Color.ColorAzul;
import alquiler.traje.prenda.Color.ColorBlanco;
import alquiler.traje.prenda.tipo.Camisa;
import alquiler.traje.prenda.tipo.camisa.TiposCamisa;

public class TestBridge {

    public static void main(String[] args) {

    // para probar el bridge solo crearemos camisas de diferentes colores:
        Camisa c = new Camisa(TiposCamisa.POPELINA,new ColorAzul());
        Camisa c2 = new Camisa(TiposCamisa.OXFORD,new ColorBlanco());

        System.out.println(c.toPrendaString());
        System.out.println(c2.toPrendaString());


    }


}
