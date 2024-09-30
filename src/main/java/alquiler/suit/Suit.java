package alquiler.suit;
import alquiler.suit.garment.Accessory;
import alquiler.suit.garment.Garment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Suit {
    private Garment pant;
    private Garment jacket;
    private Garment shirt;
    private Garment shoes;
    private State state;
    private ArrayList<Accessory> accessoryList;
    // No se si esto esté bien:
    private SuitType suitType;
    //Constructor
    public Suit(){
        accessoryList = new ArrayList<>();
        state = State.AVAILABLE; // Siempre que creamos un traje será disponible
    }
    public Suit(Suit target){
        if(target != null){
            this.pant = target.pant;
            this.shirt = target.shirt;
            this.jacket = target.jacket;
            this.shoes = target.shoes;
            this.state = target.state;
            this.suitType = target.suitType;
            this.accessoryList = target.accessoryList;
        }
    }
    public float getPrice(){
        return pant.getPrice() +
                shirt.getPrice()+
                jacket.getPrice()+
                shoes.getPrice()+
                accessoryPrice();
    }

    public Suit suitClone(){
        return new Suit(this);
    }
    @Override
    public String toString(){
        return "pant: { "+ pant.toString() + "},"+
                "\nshirt: { "+ shirt.toString() + "},"+
                "\njacket: {"+ jacket.toString() + "},"+
                "\nshoes: {"+ shoes.toString() + "},"+
                "\nstate: {"+ state.name() + "},"+
                "\naccessory: {" + listToString() + "},";
    }
    // Private:
    private float accessoryPrice(){
        if(accessoryList == null) return 0;
        float price = 0;
        for(var acc : accessoryList){
            price+=acc.getPrice();
        }
        return price;
    }
    
    private String listToString(){
        if(accessoryList == null) return "vacío";
        String str = "";
        for(var cc : accessoryList){
            str += cc.toString()+", \n";
        }
        return str;
    }
}
