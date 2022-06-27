
package paquete1;

// modificador -defoult o package- es la aucencia del modificador de acceso.
// aplica desde la clase pero no aplica al uso desde otro paquete

class DefaultPackage {
    String atributoDefault = "Atributo default";

    DefaultPackage() {
        System.out.println("Constructor default");
    }
    
    void metodoDefaultPackage(){
        System.out.println("Metodo default");
    }
    
    
    
    
}
