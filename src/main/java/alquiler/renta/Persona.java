package alquiler.renta;

public class Persona {
    
    private String Nombre;
    private String Cedula;

    public Persona(String Nombre, String Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return Cedula;
    }}
