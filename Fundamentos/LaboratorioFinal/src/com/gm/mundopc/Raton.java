
package com.gm.mundopc;


public class Raton extends DispositivoEntrada {
    
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String marca, String tipoEntrada){
        super(marca, tipoEntrada);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + " ," + super.toString() + '}';
    }
    
    
    
}
