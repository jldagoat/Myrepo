package ejercicio06_polimorfismo;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(6, 4),
            new Triangulo(3, 4, 5),
            new Circulo(1.5),
            new Rectangulo(2, 2)
        };

        System.out.println("=== Figuras (un solo arreglo de tipo Figura) ===");
        double areaTotal = 0;
        Figura mayor = figuras[0];
        for (Figura f : figuras) {
            System.out.println(f.describir());
            areaTotal += f.area();
            if (f.area() > mayor.area()) {
                mayor = f;
            }
        }

        System.out.println();
        System.out.println(String.format(Locale.forLanguageTag("es-CO"),
                "Área total: %.2f", areaTotal));
        System.out.println(String.format(Locale.forLanguageTag("es-CO"),
                "Figura de mayor área: %s (%.2f)", mayor.getNombre(), mayor.area()));

        System.out.println();
        try {
            new Triangulo(1, 2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Triangulo(1, 2, 10) -> " + e.getMessage());
        }
    }
}
