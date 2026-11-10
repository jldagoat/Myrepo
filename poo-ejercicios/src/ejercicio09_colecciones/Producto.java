package ejercicio09_colecciones;

import java.util.Locale;

public class Producto {

    private final String codigo;
    private final String nombre;
    private final double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        if (codigo == null || codigo.isBlank() || nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El código y el nombre son obligatorios.");
        }
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("El precio y la cantidad no pueden ser negativos.");
        }
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void vender(int unidades) {
        if (unidades <= 0 || unidades > cantidad) {
            throw new IllegalArgumentException(
                    "No se pueden vender " + unidades + " unidades de " + nombre
                    + " (hay " + cantidad + ").");
        }
        cantidad -= unidades;
    }

    public void reabastecer(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("Las unidades deben ser mayores que cero.");
        }
        cantidad += unidades;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("es-CO"),
                "%-5s %-18s $%,7.0f  x %3d", codigo, nombre, precio, cantidad);
    }
}
