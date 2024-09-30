package alquiler.suit.garment;

import alquiler.suit.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Accessory extends Garment {
    protected int quantity = 1; // Puede llevarse 2 pañuelos, o 2 cinturones, 3 de algo, etc [min 1]
    protected State state;
    protected String n; // name

    @Override
    public String toString(){
    return "name: "+n+", "+
            "\nquantity : "+quantity+","+
            "\nprice: "+super.price+".";
    }
}
