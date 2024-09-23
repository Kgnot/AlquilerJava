import alquiler.traje.prenda.Color.ColorBlanco;
import alquiler.traje.prenda.tipo.Acomponente.Parte;
import alquiler.traje.prenda.tipo.Saco;
import alquiler.traje.prenda.tipo.saco.TiposSacos;

public class TestComposite {
    public static void main(String[] args) {
        //Dentro del composite tenemos al componente dentro de los sacos:
        Saco saco = new Saco(TiposSacos.BLAZER,new ColorBlanco());
        saco.setComponente(Parte.PANUELO); // Esto añade un pañuelo
        System.out.println(saco.toPrendaString());
        // Aqui veremos las diferencias
        System.out.println("----------------");
        Saco saco2 = new Saco(TiposSacos.BLAZER,new ColorBlanco());
        System.out.println(saco2.toPrendaString());

    }
}