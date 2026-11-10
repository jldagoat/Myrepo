package ejercicio08_composicion;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Germán Arias", "Construcción de Software");
        Estudiante ana = new Estudiante("E001", "Ana Torres");
        Estudiante luis = new Estudiante("E002", "Luis Gómez");
        Estudiante marta = new Estudiante("E003", "Marta Ríos");
        Estudiante carlos = new Estudiante("E004", "Carlos Peña");

        Curso curso = new Curso("Programación Orientada a Objetos", profesor, 3, "Martes", 8, 12);

        System.out.println("Matricular a Ana: " + curso.matricular(ana));
        System.out.println("Matricular a Luis: " + curso.matricular(luis));
        System.out.println("Matricular a Ana otra vez: " + curso.matricular(ana));
        System.out.println("Matricular a Marta: " + curso.matricular(marta));
        System.out.println("Matricular a Carlos (sin cupo): " + curso.matricular(carlos));
        System.out.println();

        curso.mostrar();
        System.out.println();

        System.out.println("Retirar a Luis: " + curso.retirar(luis));
        System.out.println("Cupos disponibles: " + curso.cuposDisponibles());
        System.out.println("Matricular a Carlos: " + curso.matricular(carlos));
        System.out.println();

        curso = null;
        System.out.println("--- Agregación: sin el curso, los objetos siguen existiendo ---");
        System.out.println(profesor.getNombre() + " y " + ana.getNombre() + " siguen disponibles.");
    }
}
