package ejercicio05_herencia;

public class Desarrollador extends Empleado {

    public static final double VALOR_HORA_EXTRA = 25_000;

    private final String lenguaje;
    private final int horasExtra;

    public Desarrollador(String nombre, String documento, double salarioBase,
                         String lenguaje, int horasExtra) {
        super(nombre, documento, salarioBase);
        if (horasExtra < 0) {
            throw new IllegalArgumentException("Las horas extra no pueden ser negativas.");
        }
        this.lenguaje = lenguaje;
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + horasExtra * VALOR_HORA_EXTRA;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " Programo en " + lenguaje + ".";
    }

    @Override
    public String toString() {
        return super.toString() + " - Desarrollador";
    }
}
