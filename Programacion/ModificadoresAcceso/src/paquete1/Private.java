
package paquete1;


// modificador -private- no aplica al nivel de clase
// se puede utilizar solo a metodos publicos usados desde dentro de la clase
// (encapsulamiento)

public class Private {
    
    private String atributoPrivado = "Atributo Privado";
    
    private Private(){
        System.out.println("Constructor privado");
    }
    public Private(String arg){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
