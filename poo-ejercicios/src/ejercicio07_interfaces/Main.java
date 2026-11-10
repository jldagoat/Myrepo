package ejercicio07_interfaces;

public class Main {

    public static void main(String[] args) {
        int km = 8;
        MedioTransporte[] medios = {new Metro(), new Bus(), new Taxi(), new Bicicleta()};

        System.out.println("=== Viaje de " + km + " km hasta el campus ===");
        MedioTransporte masBarato = medios[0];
        MedioTransporte masRapido = medios[0];
        for (MedioTransporte m : medios) {
            System.out.println(m.resumen(km));
            if (m.costoViaje(km) < masBarato.costoViaje(km)) {
                masBarato = m;
            }
            if (m.tiempoMinutos(km) < masRapido.tiempoMinutos(km)) {
                masRapido = m;
            }
        }

        System.out.println();
        System.out.println("Más barato: " + masBarato.getNombre());
        System.out.println("Más rápido: " + masRapido.getNombre());

        System.out.println();
        System.out.println("--- Medios que además implementan Ecologico ---");
        for (MedioTransporte m : medios) {
            if (m instanceof Ecologico) {
                Ecologico verde = (Ecologico) m;
                System.out.println(m.getNombre() + ": "
                        + String.format("%.0f", verde.emisionCO2(km)) + " g de CO2");
            }
        }
        System.out.println("(Los valores de costo, velocidad y emisiones son de ejemplo.)");
    }
}
