package ejercicio09_colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {

    private final List<Producto> productos = new ArrayList<>();

    public boolean agregar(Producto producto) {
        if (buscar(producto.getCodigo()) != null) {
            return false;
        }
        productos.add(producto);
        return true;
    }

    public Producto buscar(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        Producto producto = buscar(codigo);
        if (producto == null) {
            return false;
        }
        return productos.remove(producto);
    }

    public double valorTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }

    public List<Producto> stockBajo(int limite) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCantidad() <= limite) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Producto> ordenadosPorPrecio() {
        List<Producto> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparingDouble(Producto::getPrecio));
        return copia;
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public int cantidadDeProductos() {
        return productos.size();
    }
}
