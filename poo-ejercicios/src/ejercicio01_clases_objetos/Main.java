package ejercicio01_clases_objetos;

public class Main {

    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Cien años de soledad", "Gabriel García Márquez", 471),
            new Libro("Rayuela", "Julio Cortázar", 600),
            new Libro("El túnel", "Ernesto Sabato", 160)
        };

        System.out.println("=== Catálogo ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println();
        }

        System.out.println("Prestar '" + libros[1].getTitulo() + "': " + libros[1].prestar());
        System.out.println("Prestarlo otra vez: " + libros[1].prestar());
        System.out.println();

        int disponibles = 0;
        int totalPaginas = 0;
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                disponibles++;
            }
            totalPaginas += libro.getPaginas();
        }
        System.out.println("Libros disponibles: " + disponibles + " de " + libros.length);
        System.out.println("Páginas del catálogo: " + totalPaginas);

        System.out.println("Devolver '" + libros[1].getTitulo() + "': " + libros[1].devolver());
    }
}
