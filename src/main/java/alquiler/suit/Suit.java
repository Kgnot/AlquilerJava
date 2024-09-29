package alquiler.suit;
import alquiler.suit.garment.GarmentComponent;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Suit {
    private GarmentComponent pant;
    private GarmentComponent jacket;
    private GarmentComponent shirt;
    private GarmentComponent shoes;
    private State state;
    //Constructor
    public Suit(){
        state = State.AVAILABLE; // Siempre que creamos un traje sera disponible
    }
    public Suit(Suit target){
        if(target != null){
            this.pant = target.pant;
            this.shirt = target.shirt;
            this.jacket = target.jacket;
            this.shoes = target.shoes;
            this.state = target.state;
        }
    }
    public float getCosto(){
        return pant.getPrice() +
                shirt.getPrice()+
                jacket.getPrice()+
                shoes.getPrice();
    }
    public Suit trajeClone(){
        return new Suit(this);
    }
    @Override
    public String toString(){
        return "Pantalon: "+ pant.toString() +
                "\nCamisa: "+ shirt.toString() +
                "\nSaco: "+ jacket.toString() +
                "\nZapatos: "+ shoes.toString() +
                "\nEstado: "+ state.name();
    }
}
