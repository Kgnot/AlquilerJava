package alquiler.suit.garment.complex.pant;

public enum PantType {
    
    WOOL(249000f), COTTON(249000f), LINEN(249000f);
    private final float price;

    private PantType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
