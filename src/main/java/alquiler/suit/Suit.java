package alquiler.suit;
import alquiler.suit.garment.Garment;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Suit {
    private Garment pant;
    private Garment jacket;
    private Garment shirt;
    private Garment shoes;
    private State state;
    // No se si esto esté bien:
    private SuitType suitType;
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
    public Suit suitClone(){
        return new Suit(this);
    }
    @Override
    public String toString(){
        return "pant: "+ pant.toString() +
                "\nshirt: "+ shirt.toString() +
                "\njacket: "+ jacket.toString() +
                "\nshoes: "+ shoes.toString() +
                "\nstate: "+ state.name();
    }
}
