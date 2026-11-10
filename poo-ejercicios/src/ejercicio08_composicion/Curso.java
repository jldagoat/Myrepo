package ejercicio08_composicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private final String nombre;
    private final Profesor profesor;
    private final int cupo;
    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final Horario horario;

    public Curso(String nombre, Profesor profesor, int cupo,
                 String dia, int horaInicio, int horaFin) {
        if (nombre == null || nombre.isBlank() || profesor == null || cupo <= 0) {
            throw new IllegalArgumentException("Nombre, profesor y cupo son obligatorios.");
        }
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupo = cupo;
        this.horario = new Horario(dia, horaInicio, horaFin);
    }

    public boolean matricular(Estudiante estudiante) {
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no puede ser nulo.");
        }
        if (estudiantes.contains(estudiante) || estudiantes.size() >= cupo) {
            return false;
        }
        estudiantes.add(estudiante);
        return true;
    }

    public boolean retirar(Estudiante estudiante) {
        return estudiantes.remove(estudiante);
    }

    public int cuposDisponibles() {
        return cupo - estudiantes.size();
    }

    public List<Estudiante> getEstudiantes() {
        return Collections.unmodifiableList(estudiantes);
    }

    public void mostrar() {
        System.out.println("Curso: " + nombre);
        System.out.println("Profesor: " + profesor.getNombre()
                + " (" + profesor.getEspecialidad() + ")");
        System.out.println("Horario: " + horario + " (" + horario.duracionHoras() + " horas)");
        System.out.println("Matriculados: " + estudiantes.size() + " de " + cupo);
        for (Estudiante e : estudiantes) {
            System.out.println("  - " + e.getCodigo() + " " + e.getNombre());
        }
    }
}
