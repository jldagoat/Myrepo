package ejercicio07_interfaces;

import java.util.Locale;

public interface MedioTransporte {

    String getNombre();

    double costoViaje(int km);

    int tiempoMinutos(int km);

    default String resumen(int km) {
        return String.format(Locale.forLanguageTag("es-CO"),
                "%-10s costo: $%,6.0f | tiempo: %3d min", getNombre(), costoViaje(km),
                tiempoMinutos(km));
    }
}
