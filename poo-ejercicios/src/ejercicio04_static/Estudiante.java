package ejercicio04_static;

public class Estudiante {

    public static final double NOTA_APROBATORIA = 3.0;
    private static int totalEstudiantes = 0;

    private final String nombre;
    private final double notaFinal;

    public Estudiante(String nombre, double notaFinal) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (notaFinal < 0 || notaFinal > 5) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5.");
        }
        this.nombre = nombre.trim();
        this.notaFinal = notaFinal;
        totalEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public boolean aprobo() {
        return notaFinal >= NOTA_APROBATORIA;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public static double promedioGrupo(Estudiante[] grupo) {
        if (grupo.length == 0) {
            return 0;
        }
        double suma = 0;
        for (Estudiante e : grupo) {
            suma += e.notaFinal;
        }
        return suma / grupo.length;
    }
}
