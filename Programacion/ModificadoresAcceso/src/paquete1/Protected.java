
package paquete1;

// modificador -Protected- no aplica a nivel de clase,
// aplica a nivel de variable, constructor o metodo.
// pero solo se pueden acceder desde una clase hija (super) 
public class Protected {
    protected String atributoProtected = "Atributo protected";

    protected Protected() {
        System.out.println("Constructor Protected");
    }
    public Protected(String arg) {
        System.out.println("Constructor publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
}
