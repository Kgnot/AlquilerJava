package alquiler.suit.garment.complex.jacket;

public enum JacketType {
    
    BASIC(350000F), SPORT(300000f), TUXEDO(350000f),BLAZER(400000F);
    private final float price;
    
    private JacketType(float price){
    
        this.price = price;
        
    }
    
    public float getPrice(){
    
        return price;
            
    }
           
}
