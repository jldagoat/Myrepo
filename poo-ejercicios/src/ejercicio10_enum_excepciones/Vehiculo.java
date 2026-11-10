package ejercicio10_enum_excepciones;

public class Vehiculo {

    private final String placa;
    private final TipoVehiculo tipo;

    public Vehiculo(String placa, TipoVehiculo tipo) {
        if (placa == null || placa.isBlank() || tipo == null) {
            throw new IllegalArgumentException("La placa y el tipo son obligatorios.");
        }
        this.placa = placa.trim().toUpperCase();
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }
}
