package ejercicio10_enum_excepciones;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    private final int capacidad;
    private final List<Vehiculo> vehiculos = new ArrayList<>();

    public Parqueadero(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        this.capacidad = capacidad;
    }

    public void ingresar(Vehiculo vehiculo) throws ParqueaderoLlenoException {
        if (buscar(vehiculo.getPlaca()) != null) {
            throw new IllegalArgumentException(
                    "El vehículo " + vehiculo.getPlaca() + " ya está dentro.");
        }
        if (vehiculos.size() >= capacidad) {
            throw new ParqueaderoLlenoException(capacidad);
        }
        vehiculos.add(vehiculo);
    }

    public double salir(String placa, int minutos) throws VehiculoNoEncontradoException {
        Vehiculo vehiculo = buscar(placa);
        if (vehiculo == null) {
            throw new VehiculoNoEncontradoException(placa.toUpperCase());
        }
        if (minutos <= 0) {
            throw new IllegalArgumentException("El tiempo debe ser mayor que cero.");
        }
        int horas = (int) Math.ceil(minutos / 60.0);
        vehiculos.remove(vehiculo);
        return horas * vehiculo.getTipo().getTarifaHora();
    }

    public int espaciosDisponibles() {
        return capacidad - vehiculos.size();
    }

    private Vehiculo buscar(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa.trim())) {
                return v;
            }
        }
        return null;
    }
}
