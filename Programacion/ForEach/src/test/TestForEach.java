
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        
        int edades[] = {5,6,8};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        System.out.println(" ");
        Persona personas[] = {new Persona("Juan"), new Persona("Agustin"), new Persona("Robert"), new Persona("Carla")};
        for(Persona persona: personas){
            System.out.println("Persona: " + persona.getNombre());
        }
    }
}
