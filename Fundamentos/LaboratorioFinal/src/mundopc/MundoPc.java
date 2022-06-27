package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Raton ratonHP = new Raton("bluetooth","HP");
        Teclado tecladoHP = new Teclado("bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorAsser = new Monitor("Asser", 16);
        Raton ratonAsser = new Raton("USB","Asser");
        Teclado tecladoAsser = new Teclado("USB","Asser");
        Computadora computadoraAsser = new Computadora("Computadora Asser", monitorAsser, tecladoAsser, ratonAsser);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraAsser);
        orden1.mostrarOrden();
        //Orden orden2 = new Orden()
    }
    
}
