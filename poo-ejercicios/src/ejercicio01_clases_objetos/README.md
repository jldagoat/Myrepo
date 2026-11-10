# Ejercicio 1 – Clases y objetos

## Enunciado

Crear la clase `Libro` con título, autor, número de páginas y estado de préstamo. Debe tener un constructor, métodos de consulta, `prestar()`, `devolver()` y `mostrarInfo()`. En `Main`, crear un catálogo de tres libros, prestar uno y mostrar cuántos quedan disponibles y el total de páginas.

## Conceptos de POO que se practican

- Clase y objeto
- Atributos privados
- Constructor
- Métodos de instancia
- Arreglo de objetos

## Archivos

- `Libro.java`: Clase con atributos, constructor y métodos.
- `Main.java`: Crea el catálogo y prueba los métodos.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio01_clases_objetos/*.java
java -cp out ejercicio01_clases_objetos.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
=== Catálogo ===
Título: Cien años de soledad
Autor: Gabriel García Márquez
Páginas: 471
Estado: Disponible

Título: Rayuela
Autor: Julio Cortázar
Páginas: 600
Estado: Disponible

Título: El túnel
Autor: Ernesto Sabato
Páginas: 160
Estado: Disponible

Prestar 'Rayuela': true
Prestarlo otra vez: false

Libros disponibles: 2 de 3
Páginas del catálogo: 1231
Devolver 'Rayuela': true
```
