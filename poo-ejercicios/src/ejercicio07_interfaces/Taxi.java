package ejercicio07_interfaces;

public class Taxi implements MedioTransporte {

    private static final double BANDERAZO = 5_000;
    private static final double VALOR_KM = 1_900;
    private static final double VELOCIDAD_KMH = 28;

    @Override
    public String getNombre() {
        return "Taxi";
    }

    @Override
    public double costoViaje(int km) {
        return BANDERAZO + VALOR_KM * km;
    }

    @Override
    public int tiempoMinutos(int km) {
        return (int) Math.ceil(km * 60 / VELOCIDAD_KMH);
    }
}
