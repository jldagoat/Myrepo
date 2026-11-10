package ejercicio11_biblioteca;

public class Libro {

    private final int id;
    private final String titulo;
    private final String autor;
    private boolean disponible = true;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s - %s (%s)", id, titulo, autor,
                disponible ? "disponible" : "prestado");
    }
}
