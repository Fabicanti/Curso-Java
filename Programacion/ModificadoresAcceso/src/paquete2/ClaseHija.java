
package paquete2;

import paquete1.*;

public class ClaseHija extends Protected{
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributo protegido = " + this.atributoProtected);
        this.metodoProtected();
    }
    
}
