package alquiler.suit.garment;

import java.util.ArrayList;

public abstract class ComplexGarment extends GarmentComponent {
    protected ArrayList<GarmentComponent> garmentList;
    public ArrayList<GarmentComponent> getGarments(){
        return garmentList;
    }
    public void setComponent(GarmentComponent component){
        garmentList.add(component);
    }
    public void deleteComponent(GarmentComponent component){
        garmentList.remove(component);
    }

}
