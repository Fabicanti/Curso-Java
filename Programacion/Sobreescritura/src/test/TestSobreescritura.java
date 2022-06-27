
package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Juan", 50000, "Sistemas");
//        System.out.println("Gerente 1 = " + gerente1.obtenerDetalles());
        
        // POLIMORFISMO
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado: " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Carla", 100000, "Contabilidad");
        //System.out.println("empleado/Gerente 2 = " + gerente2.obtenerDetalles());
        imprimir(empleado);
        
    }
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
