package ejercicio05_herencia;

public class Gerente extends Empleado {

    private final double bono;
    private final int personasACargo;

    public Gerente(String nombre, String documento, double salarioBase,
                   double bono, int personasACargo) {
        super(nombre, documento, salarioBase);
        if (bono < 0 || personasACargo < 0) {
            throw new IllegalArgumentException(
                    "El bono y las personas a cargo no pueden ser negativos.");
        }
        this.bono = bono;
        this.personasACargo = personasACargo;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " Dirijo un equipo de " + personasACargo + " personas.";
    }

    @Override
    public String toString() {
        return super.toString() + " - Gerente";
    }
}
