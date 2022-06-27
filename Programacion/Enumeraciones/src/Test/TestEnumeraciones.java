package Test;

import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        indicarDias(Dias.DOMINGO);
    }
    
    
    private static void indicarDias(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Primer dia de la semana: " + Dias.LUNES);
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana: " + Dias.MARTES);
                break;     
            case MIERCOLES:
                System.out.println("Tercer dia de la semana: " + Dias.MIERCOLES);
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana: " + Dias.JUEVES);
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana: " + Dias.VIERNES);
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana: " + Dias.SABADO);
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana: " + Dias.DOMINGO);
        }
    }
}
