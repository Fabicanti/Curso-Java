
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 10);
        System.out.println("resultado1 = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.2, 9.6);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(5, 9L);
        System.out.println("resultado3 = " + resultado3); 
    }
    
}
