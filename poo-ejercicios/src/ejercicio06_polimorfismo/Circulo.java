package ejercicio06_polimorfismo;

public class Circulo extends Figura {

    private final double radio;

    public Circulo(double radio) {
        super("Círculo");
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
