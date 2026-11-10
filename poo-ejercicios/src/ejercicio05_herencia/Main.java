package ejercicio05_herencia;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pedro Ruiz", "1020304050", 2_000_000);
        Desarrollador dev = new Desarrollador("Laura Gómez", "1017654321", 3_500_000, "Java", 10);
        Gerente gerente = new Gerente("Sofía Mejía", "43210987", 6_000_000, 1_500_000, 8);

        System.out.println(empleado);
        System.out.println(empleado.presentarse());
        System.out.println("Salario: " + Empleado.pesos(empleado.calcularSalario()));
        System.out.println();

        System.out.println(dev);
        System.out.println(dev.presentarse());
        System.out.println("Salario (base + 10 horas extra): "
                + Empleado.pesos(dev.calcularSalario()));
        System.out.println();

        System.out.println(gerente);
        System.out.println(gerente.presentarse());
        System.out.println("Salario (base + bono): " + Empleado.pesos(gerente.calcularSalario()));
        System.out.println();

        System.out.println("--- Relación 'es un' ---");
        System.out.println("dev instanceof Empleado: " + (dev instanceof Empleado));
        System.out.println("gerente instanceof Empleado: " + (gerente instanceof Empleado));
        System.out.println("empleado instanceof Gerente: " + (empleado instanceof Gerente));
    }
}
