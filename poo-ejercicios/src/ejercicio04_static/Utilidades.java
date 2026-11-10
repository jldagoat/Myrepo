package ejercicio04_static;

public class Utilidades {

    private Utilidades() {
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n debe estar entre 0 y 20.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int maximo(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        }
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
