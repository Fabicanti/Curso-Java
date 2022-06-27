
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10
    }
    
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion Constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
