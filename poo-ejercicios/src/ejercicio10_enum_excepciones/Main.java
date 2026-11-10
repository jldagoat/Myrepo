package ejercicio10_enum_excepciones;

import java.util.Locale;

public class Main {

    private static String pesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }

    public static void main(String[] args) {
        System.out.println("=== Tarifas por hora (enum TipoVehiculo) ===");
        for (TipoVehiculo tipo : TipoVehiculo.values()) {
            System.out.println(tipo + ": " + pesos(tipo.getTarifaHora()));
        }
        System.out.println();

        Parqueadero parqueadero = new Parqueadero(3);
        Vehiculo[] llegadas = {
            new Vehiculo("abc123", TipoVehiculo.CARRO),
            new Vehiculo("xyz98a", TipoVehiculo.MOTO),
            new Vehiculo("bus456", TipoVehiculo.BUS),
            new Vehiculo("def789", TipoVehiculo.CARRO)
        };

        for (Vehiculo v : llegadas) {
            try {
                parqueadero.ingresar(v);
                System.out.println("Ingresa " + v.getPlaca() + " (" + v.getTipo() + "). "
                        + "Espacios libres: " + parqueadero.espaciosDisponibles());
            } catch (ParqueaderoLlenoException e) {
                System.out.println("No ingresa " + v.getPlaca() + ": " + e.getMessage());
            }
        }

        System.out.println();
        try {
            parqueadero.ingresar(new Vehiculo("ABC123", TipoVehiculo.CARRO));
        } catch (ParqueaderoLlenoException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ingreso repetido: " + e.getMessage());
        }

        System.out.println();
        String[] placas = {"ABC123", "XYZ98A", "QQQ000"};
        int[] minutos = {125, 40, 30};
        for (int i = 0; i < placas.length; i++) {
            try {
                double cobro = parqueadero.salir(placas[i], minutos[i]);
                System.out.println("Sale " + placas[i] + " tras " + minutos[i]
                        + " min. Cobro: " + pesos(cobro));
            } catch (VehiculoNoEncontradoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Espacios libres al final: " + parqueadero.espaciosDisponibles());
    }
}
