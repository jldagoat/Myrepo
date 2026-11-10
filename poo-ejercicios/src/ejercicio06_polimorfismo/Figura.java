package ejercicio06_polimorfismo;

import java.util.Locale;

public abstract class Figura {

    private final String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double area();

    public abstract double perimetro();

    public String describir() {
        return String.format(Locale.forLanguageTag("es-CO"),
                "%-10s área: %8.2f | perímetro: %7.2f", nombre, area(), perimetro());
    }
}
