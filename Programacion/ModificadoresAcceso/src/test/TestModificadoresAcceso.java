
package test;

import paquete1.*;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
//        PublicAcess clase1 = new PublicAcess();
//        
//        System.out.println("clase1: " + clase1);
//        System.out.println("clase1: " + clase1.atributoPublico);
//        clase1.metodoPublico();
//        
//        
//        Protected clase2 = new Protected("Publico");
//        
//        System.out.println("clase2: " + clase2);
//        System.out.println("clase2: " + clase2.atributoProtected);
//        clase2.metodoProtected();

//
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("Clase Hija = " + claseHija);


/*
          Test clase Default solo desde el mismo paquete

//        DefaultPackage clase3 = new DefaultPackage();
//        
//        System.out.println("clase1: " + clase3);
//        clase3.atributoDefault = "Cambio de prueba";
//        System.out.println("clase1: " + clase3.atributoDefault);
//        clase1.metodoDefaultPackage();
          
*/

        Private clase4 = new Private("Publico");
        clase4.setAtributoPrivado("Cambio valor atributo");
        System.out.println("clase4 = " + clase4.getAtributoPrivado());
    }
    
}
