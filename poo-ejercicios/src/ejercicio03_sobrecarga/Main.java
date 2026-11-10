package ejercicio03_sobrecarga;

public class Main {

    public static void main(String[] args) {
        Rectangulo porDefecto = new Rectangulo();
        Rectangulo cuadrado = new Rectangulo(4);
        Rectangulo rectangulo = new Rectangulo(6, 3.5);

        System.out.println("Constructor sin parámetros: " + porDefecto);
        System.out.println("Constructor con un lado:    " + cuadrado);
        System.out.println("Constructor con base y altura: " + rectangulo);

        System.out.println();
        System.out.println("--- Método escalar sobrecargado ---");
        rectangulo.escalar(2);
        System.out.println("escalar(2):    " + rectangulo);
        rectangulo.escalar(1, 3);
        System.out.println("escalar(1, 3): " + rectangulo);

        System.out.println();
        try {
            new Rectangulo(-2, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rectangulo(-2, 5) -> " + e.getMessage());
        }
    }
}
