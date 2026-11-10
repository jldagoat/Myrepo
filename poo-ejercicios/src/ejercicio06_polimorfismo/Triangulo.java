package ejercicio06_polimorfismo;

public class Triangulo extends Figura {

    private final double a;
    private final double b;
    private final double c;

    public Triangulo(double a, double b, double c) {
        super("Triángulo");
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimetro() {
        return a + b + c;
    }
}
