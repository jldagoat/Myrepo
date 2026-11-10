package ejercicio01_clases_objetos;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean prestar() {
        if (prestado) {
            return false;
        }
        prestado = true;
        return true;
    }

    public boolean devolver() {
        if (!prestado) {
            return false;
        }
        prestado = false;
        return true;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Estado: " + (prestado ? "Prestado" : "Disponible"));
    }
}
