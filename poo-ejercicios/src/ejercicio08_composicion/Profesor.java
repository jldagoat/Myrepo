package ejercicio08_composicion;

public class Profesor {

    private final String nombre;
    private final String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
