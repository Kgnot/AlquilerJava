package alquiler.traje;

import alquiler.traje.prenda.Prenda;
import lombok.Setter;

@Setter
public class Traje {

    private Prenda pantalon;
    private Prenda saco;
    private Prenda camisa;
    private Prenda zapatos;
    private Estado estado;
    //Constructor
    public Traje(){
        estado = Estado.DISPONIBLE; // Siempre que creamos un traje sera disponible
    }
    public Traje(Traje target){
        if(target != null){
            this.pantalon = target.pantalon;
            this.camisa = target.camisa;
            this.saco = target.saco;
            this.zapatos = target.zapatos;
            this.estado = target.estado;
        }
    }
    public float getCosto(){
        return pantalon.getPrecio() +
                camisa.getPrecio()+
                saco.getPrecio()+
                zapatos.getPrecio();
    }

    // Debo setear a la hora de crear un traje xd


    public Traje trajeClone(){
        return new Traje(this);
    }

    @Override
    public String toString(){
        return "Pantalon: "+pantalon.toPrendaString() +
                "\nCamisa: "+ camisa.toPrendaString() +
                "\nSaco: "+saco.toPrendaString() +
                "\nZapatos: "+zapatos.toPrendaString() +
                "\nEstado: "+estado.name();
    }

}
