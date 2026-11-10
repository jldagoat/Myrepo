package ejercicio04_static;

import java.util.Locale;

public class Main {

    private static String nota(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "%.1f", valor);
    }

    public static void main(String[] args) {
        System.out.println("Estudiantes creados al inicio: " + Estudiante.getTotalEstudiantes());

        Estudiante[] grupo = {
            new Estudiante("Ana Torres", 4.5),
            new Estudiante("Luis Gómez", 2.8),
            new Estudiante("Marta Ríos", 3.0),
            new Estudiante("Carlos Peña", 3.9)
        };

        System.out.println("Estudiantes creados después: " + Estudiante.getTotalEstudiantes());
        System.out.println("Nota mínima para aprobar: " + nota(Estudiante.NOTA_APROBATORIA));
        System.out.println();

        for (Estudiante e : grupo) {
            System.out.println(e.getNombre() + " -> " + nota(e.getNotaFinal())
                    + (e.aprobo() ? " (aprobó)" : " (reprobó)"));
        }
        System.out.println(String.format(Locale.forLanguageTag("es-CO"),
                "Promedio del grupo: %.2f", Estudiante.promedioGrupo(grupo)));

        System.out.println();
        System.out.println("--- Métodos estáticos de Utilidades (sin crear objetos) ---");
        System.out.println("esPar(7): " + Utilidades.esPar(7));
        System.out.println("factorial(10): " + Utilidades.factorial(10));
        int[] numeros = {4, 17, 9, 12};
        System.out.println("maximo({4, 17, 9, 12}): " + Utilidades.maximo(numeros));
    }
}
