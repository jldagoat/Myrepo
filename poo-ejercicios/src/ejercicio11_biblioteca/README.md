# Ejercicio 11 – Mini proyecto: biblioteca con menú

## Enunciado

Sistema de biblioteca por consola que integra los temas anteriores. Menú con las opciones: agregar libro, listar, prestar, devolver, buscar por autor y salir. El programa no debe cerrarse si el usuario escribe algo inválido (por ejemplo, un id que no es número o que no existe).

## Conceptos de POO que se practican

- Varias clases que colaboran (`Libro`, `Biblioteca`, `Main`)
- Menú con `Scanner`, `while` y `switch`
- Validación de entradas del usuario
- Encapsulamiento y colecciones

## Archivos

- `Libro.java`: Libro con id y estado.
- `Biblioteca.java`: Lógica del sistema (sin entrada/salida).
- `Main.java`: Menú e interacción con el usuario.
- `entrada_ejemplo.txt`: Entrada de ejemplo para probar sin escribir.

## Cómo ejecutarlo

En VS Code: abrir `Main.java`, pulsar **Run** y escribir las opciones en la terminal.

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio11_biblioteca/*.java
java -cp out ejercicio11_biblioteca.Main
```

Para probarlo sin escribir (Linux, macOS o Símbolo del sistema de Windows):

```
java -cp out ejercicio11_biblioteca.Main < src/ejercicio11_biblioteca/entrada_ejemplo.txt
```

En PowerShell: `Get-Content src/ejercicio11_biblioteca/entrada_ejemplo.txt | java -cp out ejercicio11_biblioteca.Main`.

## Salida

Salida obtenida con `entrada_ejemplo.txt`. Los textos de "Título:", "Autor:" y "Opción:" aparecen seguidos porque la entrada viene de un archivo y no se ve lo que se escribe.

<details>
<summary>Ver la salida completa</summary>

```

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Título: Autor: Libro agregado: [1] El túnel - Ernesto Sabato (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Título: Autor: Libro agregado: [2] Rayuela - Julio Cortázar (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Título: Autor: Libro agregado: [3] Pedro Páramo - Juan Rulfo (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: [1] El túnel - Ernesto Sabato (disponible)
[2] Rayuela - Julio Cortázar (disponible)
[3] Pedro Páramo - Juan Rulfo (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Id del libro: Préstamo registrado: 'Rayuela'.

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Id del libro: El libro 'Rayuela' ya está prestado.

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: [1] El túnel - Ernesto Sabato (disponible)
[2] Rayuela - Julio Cortázar (prestado)
[3] Pedro Páramo - Juan Rulfo (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Autor a buscar: [2] Rayuela - Julio Cortázar (prestado)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Id del libro: Devolución registrada: 'Rayuela'.

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Id del libro: No existe un libro con id 9.

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Opción no válida.

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: [1] El túnel - Ernesto Sabato (disponible)
[2] Rayuela - Julio Cortázar (disponible)
[3] Pedro Páramo - Juan Rulfo (disponible)

=== BIBLIOTECA ===
1. Agregar libro
2. Listar libros
3. Prestar libro
4. Devolver libro
5. Buscar por autor
0. Salir
Opción: Hasta pronto.
```

</details>
