package ejercicio07_interfaces;

public class Metro implements MedioTransporte, Ecologico {

    private static final double TARIFA = 3_000;
    private static final double VELOCIDAD_KMH = 35;
    private static final double GRAMOS_CO2_POR_KM = 10;

    @Override
    public String getNombre() {
        return "Metro";
    }

    @Override
    public double costoViaje(int km) {
        return TARIFA;
    }

    @Override
    public int tiempoMinutos(int km) {
        return (int) Math.ceil(km * 60 / VELOCIDAD_KMH);
    }

    @Override
    public double emisionCO2(int km) {
        return km * GRAMOS_CO2_POR_KM;
    }
}
