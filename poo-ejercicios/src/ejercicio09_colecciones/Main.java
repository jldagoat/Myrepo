package ejercicio09_colecciones;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregar(new Producto("C01", "Café americano", 3_500, 40));
        inventario.agregar(new Producto("E01", "Empanada", 2_800, 6));
        inventario.agregar(new Producto("J01", "Jugo natural", 4_500, 25));
        inventario.agregar(new Producto("S01", "Sándwich", 7_200, 4));
        inventario.agregar(new Producto("G01", "Galletas", 1_500, 60));

        System.out.println("Agregar un código repetido: "
                + inventario.agregar(new Producto("C01", "Café doble", 5_000, 10)));
        System.out.println();

        System.out.println("=== Inventario (" + inventario.cantidadDeProductos()
                + " productos) ===");
        for (Producto p : inventario.getProductos()) {
            System.out.println(p);
        }
        System.out.println(String.format(Locale.forLanguageTag("es-CO"),
                "Valor total del inventario: $%,.0f", inventario.valorTotal()));

        System.out.println();
        System.out.println("=== Ordenados por precio (menor a mayor) ===");
        for (Producto p : inventario.ordenadosPorPrecio()) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("=== Stock bajo (5 unidades o menos) ===");
        for (Producto p : inventario.stockBajo(5)) {
            System.out.println(p);
        }

        System.out.println();
        Producto sandwich = inventario.buscar("S01");
        sandwich.vender(3);
        System.out.println("Se venden 3 sándwiches. Quedan: " + sandwich.getCantidad());
        try {
            sandwich.vender(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Eliminar G01: " + inventario.eliminar("G01"));
        System.out.println("Eliminar X99: " + inventario.eliminar("X99"));
        System.out.println("Productos restantes: " + inventario.cantidadDeProductos());
    }
}
