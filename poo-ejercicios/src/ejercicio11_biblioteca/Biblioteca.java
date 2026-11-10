package ejercicio11_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Libro> libros = new ArrayList<>();
    private int siguienteId = 1;

    public Libro agregar(String titulo, String autor) {
        if (titulo == null || titulo.isBlank() || autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El título y el autor son obligatorios.");
        }
        Libro libro = new Libro(siguienteId++, titulo.trim(), autor.trim());
        libros.add(libro);
        return libro;
    }

    public List<Libro> listar() {
        return new ArrayList<>(libros);
    }

    public Libro buscarPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> buscarPorAutor(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(texto.trim().toLowerCase())) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public String prestar(int id) {
        Libro libro = buscarPorId(id);
        if (libro == null) {
            return "No existe un libro con id " + id + ".";
        }
        if (!libro.isDisponible()) {
            return "El libro '" + libro.getTitulo() + "' ya está prestado.";
        }
        libro.setDisponible(false);
        return "Préstamo registrado: '" + libro.getTitulo() + "'.";
    }

    public String devolver(int id) {
        Libro libro = buscarPorId(id);
        if (libro == null) {
            return "No existe un libro con id " + id + ".";
        }
        if (libro.isDisponible()) {
            return "El libro '" + libro.getTitulo() + "' no estaba prestado.";
        }
        libro.setDisponible(true);
        return "Devolución registrada: '" + libro.getTitulo() + "'.";
    }
}
