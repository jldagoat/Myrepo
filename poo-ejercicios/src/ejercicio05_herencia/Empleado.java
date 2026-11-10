package ejercicio05_herencia;

import java.util.Locale;

public class Empleado {

    private final String nombre;
    private final String documento;
    private final double salarioBase;

    public Empleado(String nombre, String documento, double salarioBase) {
        if (nombre == null || nombre.isBlank() || documento == null || documento.isBlank()) {
            throw new IllegalArgumentException("El nombre y el documento son obligatorios.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo.");
        }
        this.nombre = nombre.trim();
        this.documento = documento.trim();
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String presentarse() {
        return "Hola, soy " + nombre + " y trabajo en la empresa.";
    }

    public static String pesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }

    @Override
    public String toString() {
        return nombre + " (CC " + documento + ")";
    }
}
