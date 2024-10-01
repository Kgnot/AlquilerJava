package alquiler.comp;

import lombok.Getter;

@Getter
public class Person {
    
    private final String name;
    private final String cedula;
    private final String email;

    public Person(String name, String cedula, String email) {
        this.name = name;
        this.cedula = cedula;
        this.email = email;
    }

}
