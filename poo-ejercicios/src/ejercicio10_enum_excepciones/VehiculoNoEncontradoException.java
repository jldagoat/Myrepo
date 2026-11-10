package ejercicio10_enum_excepciones;

public class VehiculoNoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehiculoNoEncontradoException(String placa) {
        super("No hay ningún vehículo con placa " + placa + " en el parqueadero.");
    }
}
