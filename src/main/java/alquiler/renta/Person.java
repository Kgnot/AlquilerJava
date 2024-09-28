package alquiler.renta;

public class Person {
    
    private String Nombre;
    private String Cedula;

    public Person(String Nombre, String Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return Cedula;
    }}
