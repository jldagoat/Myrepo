package ejercicio10_enum_excepciones;

public class ParqueaderoLlenoException extends Exception {

    private static final long serialVersionUID = 1L;

    public ParqueaderoLlenoException(int capacidad) {
        super("El parqueadero está lleno (capacidad: " + capacidad + ").");
    }
}
