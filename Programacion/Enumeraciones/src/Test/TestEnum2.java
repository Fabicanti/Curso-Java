package Test;

import enumeracion.Continentes;

public class TestEnum2 {
    public static void main(String[] args) {
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to Continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("No. Paises en el 1er Continente: " + Continentes.AFRICA.getPaises());
    }
}
