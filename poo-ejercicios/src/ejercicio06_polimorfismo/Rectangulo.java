package ejercicio06_polimorfismo;

public class Rectangulo extends Figura {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Las medidas deben ser mayores que cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}
