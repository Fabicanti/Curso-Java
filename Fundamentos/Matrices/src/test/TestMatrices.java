
package test;

import domain.Persona;
import static test.TestMatrices.imprimir;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        
        edades[0][0] = 5;
        edades[0][1] = 6;
        edades[1][0] = 29;
        edades[1][1] = 44;
        edades[2][0] = 85;
        edades[2][1] = 50;
        
//        System.out.println("edades 0-0  " + edades[0][0]);
//        System.out.println("edades 0-1  " + edades[0][1]);
//        System.out.println("edades 1-0  " + edades[1][0]);
//        System.out.println("edades 1-1  " + edades[1][1]);
//        System.out.println("edades 2-0  " + edades[2][0]);
//        System.out.println("edades 2-1  " + edades[2][1]);
//        
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + " : " + edades[ren][col]);
                
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Banana","Mango"},{"Frutilla","Mora"}};
        imprimir(frutas);
        
//        for (int ren = 0; ren < frutas.length; ren++) {
//            for (int col = 0; col < frutas[ren].length; col++) {
//                System.out.println("frutas " + ren + "-" + col + " : " + frutas[ren][col]);
//                
//            }
//        }
        
        
        Persona personas[][] = new Persona[2][2];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Carlos");
        personas[1][0] = new Persona("Karla");
        personas[1][1] = new Persona("Roberto");
        
        imprimir(personas);
        
        
    }
    
    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren + "-" + col + " : " + matriz[ren][col]);
                
            }
        }
    }
    
}
