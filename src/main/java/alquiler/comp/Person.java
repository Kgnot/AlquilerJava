package alquiler.comp;

public class Person {
    
    private String name;
    private String cedula;

    public Person(String name, String cedula) {
        this.name = name;
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public String getCedula() {
        return cedula;
    }}
