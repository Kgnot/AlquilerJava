package alquiler.suit.garment.complex.shoes;

public enum ShoesType {
    LEGATE(300500f), SEMIBROGUE(255000f), BROGUE(150500f), DERBY(200000f), CROMWELL(150000f), GRAFTON(75000f);
    private final float price;

    private ShoesType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
