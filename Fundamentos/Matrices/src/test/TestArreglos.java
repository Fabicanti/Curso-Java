
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[5];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
        edades[1] = 15;
        System.out.println("edades = " + edades[1]);
        
        edades[2] = 20;
        System.out.println("edades = " + edades[2]);
        
        //edades[6] = 5;
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("edades elemnto " + i + ":" + edades[i]);
        }
    }
    
}
