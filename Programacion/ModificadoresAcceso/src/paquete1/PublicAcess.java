
package paquete1;

// modificador -Public- utilizable desde cualquier clase,
// metodo , variable o paquete.
public class PublicAcess {
    public String atributoPublico = "Atributo publico";

    public PublicAcess() {
        System.out.println("Constructor publico");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo Publico");
    }
    
}
