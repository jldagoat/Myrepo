package ejercicio10_enum_excepciones;

public enum TipoVehiculo {
    MOTO(1_500),
    CARRO(3_000),
    BUS(6_000);

    private final int tarifaHora;

    TipoVehiculo(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public int getTarifaHora() {
        return tarifaHora;
    }
}
