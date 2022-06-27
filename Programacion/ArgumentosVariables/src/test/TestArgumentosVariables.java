package test;
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,3,5,8,9,12);
        imprimirNumeros(5,6);
        variosParametros("Juan", 3,4,5);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
            
        }
    }
}
