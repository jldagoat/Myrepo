package ejercicio07_interfaces;

public class Bus implements MedioTransporte {

    private static final double TARIFA = 2_800;
    private static final double VELOCIDAD_KMH = 18;

    @Override
    public String getNombre() {
        return "Bus";
    }

    @Override
    public double costoViaje(int km) {
        return TARIFA;
    }

    @Override
    public int tiempoMinutos(int km) {
        return (int) Math.ceil(km * 60 / VELOCIDAD_KMH);
    }
}
