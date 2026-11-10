package ejercicio08_composicion;

public class Horario {

    private final String dia;
    private final int horaInicio;
    private final int horaFin;

    public Horario(String dia, int horaInicio, int horaFin) {
        if (horaInicio < 0 || horaFin > 24 || horaFin <= horaInicio) {
            throw new IllegalArgumentException("El horario no es válido.");
        }
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int duracionHoras() {
        return horaFin - horaInicio;
    }

    @Override
    public String toString() {
        return dia + " de " + horaInicio + ":00 a " + horaFin + ":00";
    }
}
