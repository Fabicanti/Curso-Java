package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        booblean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        //Autoboxing
        Integer entero = 10;
        System.out.println("entero = " + entero); //integer
        System.out.println("entero = " + entero.toString()); // string
        System.out.println("entero = " + entero.doubleValue()); // double
        
        
        //Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
    }
    
}
