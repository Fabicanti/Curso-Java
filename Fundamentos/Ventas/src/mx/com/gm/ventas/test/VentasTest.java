
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Medias", 10.00);
        Producto producto4 = new Producto("Remera", 60.00);
        Producto producto5 = new Producto("Saco", 200.00);
        
        System.out.println(" ----------------------- ");
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        System.out.println(" ----------------------- ");
        Orden orden2 = new Orden();
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
    }
    
}
