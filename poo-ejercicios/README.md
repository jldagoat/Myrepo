# Ejercicios de Programación Orientada a Objetos (Java)

Colección de ejercicios de POO en Java: clases y objetos, encapsulamiento, sobrecarga, miembros estáticos,
herencia, clases abstractas y polimorfismo, interfaces, composición y agregación, colecciones, enumeraciones y
excepciones propias, y un mini proyecto final con menú por consola.

**Autor:** _(escribe aquí tu nombre)_

## Requisitos

- JDK 17 o superior.
- Visual Studio Code con la extensión **Extension Pack for Java** (opcional; también funciona por terminal).

## Estructura

```
poo-ejercicios/
├── .vscode/settings.json
├── .gitignore
├── README.md
└── src/
    ├── ejercicio01_clases_objetos/
    ├── ejercicio02_encapsulamiento/
    ├── ...
    └── ejercicio11_biblioteca/
```

Cada ejercicio es un paquete con sus clases, un `Main` para ejecutarlo y un `README.md` con el enunciado,
los conceptos que practica y la salida del programa.

## Ejercicios

| N.º | Tema | Conceptos principales |
|---|---|---|
| 1 | [Clases y objetos](src/ejercicio01_clases_objetos) | Clase y objeto; Atributos privados |
| 2 | [Encapsulamiento](src/ejercicio02_encapsulamiento) | Encapsulamiento (`private`); Métodos de acceso sin `set` |
| 3 | [Sobrecarga de constructores y métodos](src/ejercicio03_sobrecarga) | Sobrecarga de constructores; Encadenamiento con `this(...)` |
| 4 | [Miembros estáticos](src/ejercicio04_static) | Atributo `static` (contador compartido); Constante `static final` |
| 5 | [Herencia](src/ejercicio05_herencia) | Herencia (`extends`); `super` en constructores y métodos |
| 6 | [Clases abstractas y polimorfismo](src/ejercicio06_polimorfismo) | Clase abstracta y métodos abstractos; Polimorfismo (arreglo de tipo `Figura`) |
| 7 | [Interfaces](src/ejercicio07_interfaces) | Interfaz (`interface` / `implements`); Método `default` |
| 8 | [Composición y agregación](src/ejercicio08_composicion) | Composición (`Curso` crea su `Horario`); Agregación (`Profesor` y `Estudiante` existen sin el curso) |
| 9 | [Colecciones de objetos](src/ejercicio09_colecciones) | `ArrayList` de objetos; Búsqueda y filtrado con ciclos |
| 10 | [Enumeraciones y excepciones personalizadas](src/ejercicio10_enum_excepciones) | `enum` con atributos y constructor; Excepciones propias (`extends Exception`) |
| 11 | [Mini proyecto: biblioteca con menú](src/ejercicio11_biblioteca) | Varias clases que colaboran (`Libro`, `Biblioteca`, `Main`); Menú con `Scanner`, `while` y `switch` |

## Cómo ejecutar

1. Abrir en VS Code la carpeta `poo-ejercicios` (la que contiene `src`).
2. Esperar a que la extensión de Java termine de cargar y comprobar que el panel Problemas no muestra errores.
3. Abrir el `Main.java` del ejercicio que se quiere probar y pulsar **Run**.

Por terminal, desde esta carpeta (ejemplo con el ejercicio 1):

```
javac -encoding UTF-8 -d out src/ejercicio01_clases_objetos/*.java
java -cp out ejercicio01_clases_objetos.Main
```
