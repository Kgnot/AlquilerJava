package alquiler.suit.garment;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

@Getter
@Setter
public abstract class GarmentComponent {
    protected Color color;
    protected float price;

    public abstract ArrayList<GarmentComponent> getGarments();

}
