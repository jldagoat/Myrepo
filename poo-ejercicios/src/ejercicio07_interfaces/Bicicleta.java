package ejercicio07_interfaces;

public class Bicicleta implements MedioTransporte, Ecologico {

    private static final double VELOCIDAD_KMH = 15;

    @Override
    public String getNombre() {
        return "Bicicleta";
    }

    @Override
    public double costoViaje(int km) {
        return 0;
    }

    @Override
    public int tiempoMinutos(int km) {
        return (int) Math.ceil(km * 60 / VELOCIDAD_KMH);
    }

    @Override
    public double emisionCO2(int km) {
        return 0;
    }
}
