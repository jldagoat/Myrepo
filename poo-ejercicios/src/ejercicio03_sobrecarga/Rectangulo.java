package ejercicio03_sobrecarga;

import java.util.Locale;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
        this(1, 1);
    }

    public Rectangulo(double lado) {
        this(lado, lado);
    }

    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Las medidas deben ser mayores que cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public boolean esCuadrado() {
        return base == altura;
    }

    public void escalar(double factor) {
        escalar(factor, factor);
    }

    public void escalar(double factorBase, double factorAltura) {
        if (factorBase <= 0 || factorAltura <= 0) {
            throw new IllegalArgumentException("Los factores deben ser mayores que cero.");
        }
        base *= factorBase;
        altura *= factorAltura;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("es-CO"),
                "Rectángulo %.1f x %.1f (área %.2f, perímetro %.2f%s)",
                base, altura, area(), perimetro(), esCuadrado() ? ", cuadrado" : "");
    }
}
