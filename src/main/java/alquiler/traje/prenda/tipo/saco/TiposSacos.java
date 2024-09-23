package alquiler.traje.prenda.tipo.saco;

public enum TiposSacos {
    
    BASICO(350000F),DEPORTIVO(300000f),ESMOQUIN(350000f),BLAZER(400000F);
    private final float precio;
    
    private TiposSacos(float precio){
    
        this.precio = precio;
        
    }
    
    public float getPrecio(){
    
        return precio;
            
    }
           
}
