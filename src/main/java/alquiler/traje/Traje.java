package alquiler.traje;

import alquiler.traje.prenda.Prenda;

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

    public Traje trajeClone(){
        return new Traje(this);
    }



}
