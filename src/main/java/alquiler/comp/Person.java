package alquiler.comp;

import lombok.Getter;

@Getter
public class Person {
    
    private final String name;
    private final String cedula;

    public Person(String name, String cedula) {
        this.name = name;
        this.cedula = cedula;
    }

}
