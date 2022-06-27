
package domain;


public class Empleado extends Persona{
    private double sueldo;
    private int idEmpleado;
    private static int contadorEmpleado;

    public Empleado(){
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(double sueldo, String nombre) {
        //super(nombre);
        this();
        this.setNombre(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append(", idEmpleado=").append(this.idEmpleado);
        sb.append("sueldo=").append(this.sueldo); 
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
