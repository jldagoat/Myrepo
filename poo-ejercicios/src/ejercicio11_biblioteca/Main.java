package ejercicio11_biblioteca;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            String opcion = leer(scanner, "Opción: ");
            if (opcion == null) {
                break;
            }
            switch (opcion.trim()) {
                case "1":
                    agregar(biblioteca, scanner);
                    break;
                case "2":
                    listar(biblioteca.listar());
                    break;
                case "3":
                    prestar(biblioteca, scanner);
                    break;
                case "4":
                    devolver(biblioteca, scanner);
                    break;
                case "5":
                    buscarPorAutor(biblioteca, scanner);
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("Hasta pronto.");
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("=== BIBLIOTECA ===");
        System.out.println("1. Agregar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Buscar por autor");
        System.out.println("0. Salir");
    }

    private static String leer(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        if (!scanner.hasNextLine()) {
            return null;
        }
        return scanner.nextLine();
    }

    private static int leerId(Scanner scanner) {
        String texto = leer(scanner, "Id del libro: ");
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException | NullPointerException e) {
            return -1;
        }
    }

    private static void agregar(Biblioteca biblioteca, Scanner scanner) {
        String titulo = leer(scanner, "Título: ");
        String autor = leer(scanner, "Autor: ");
        try {
            Libro libro = biblioteca.agregar(titulo, autor);
            System.out.println("Libro agregado: " + libro);
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo agregar: " + e.getMessage());
        }
    }

    private static void listar(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    private static void prestar(Biblioteca biblioteca, Scanner scanner) {
        System.out.println(biblioteca.prestar(leerId(scanner)));
    }

    private static void devolver(Biblioteca biblioteca, Scanner scanner) {
        System.out.println(biblioteca.devolver(leerId(scanner)));
    }

    private static void buscarPorAutor(Biblioteca biblioteca, Scanner scanner) {
        String texto = leer(scanner, "Autor a buscar: ");
        if (texto == null) {
            return;
        }
        List<Libro> encontrados = biblioteca.buscarPorAutor(texto);
        if (encontrados.isEmpty()) {
            System.out.println("Sin resultados.");
        } else {
            listar(encontrados);
        }
    }
}
