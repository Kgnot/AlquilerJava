package alquiler.suit.garment.complex.shirt;

public enum ShirtType {
    
    OXFORD(269000f),POPELINA(209000f),SARGA(350000f);
    private final float price;

    private ShirtType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    
}
