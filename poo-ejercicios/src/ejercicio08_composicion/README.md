# Ejercicio 8 – Composición y agregación

## Enunciado

Un curso tiene un profesor, un cupo, una lista de estudiantes matriculados y un horario. Matricular a un estudiante solo es posible si hay cupo y no está repetido. El horario pertenece al curso (se crea dentro de él), mientras que el profesor y los estudiantes existen por sí solos.

## Conceptos de POO que se practican

- Composición (`Curso` crea su `Horario`)
- Agregación (`Profesor` y `Estudiante` existen sin el curso)
- Lista de objetos
- Lista no modificable (`Collections.unmodifiableList`)

## Archivos

- `Profesor.java`: Entidad independiente.
- `Estudiante.java`: Entidad independiente.
- `Horario.java`: Parte del curso (composición).
- `Curso.java`: Relaciona todo y controla el cupo.
- `Main.java`: Matricula, retira y muestra.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio08_composicion/*.java
java -cp out ejercicio08_composicion.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Matricular a Ana: true
Matricular a Luis: true
Matricular a Ana otra vez: false
Matricular a Marta: true
Matricular a Carlos (sin cupo): false

Curso: Programación Orientada a Objetos
Profesor: Germán Arias (Construcción de Software)
Horario: Martes de 8:00 a 12:00 (4 horas)
Matriculados: 3 de 3
  - E001 Ana Torres
  - E002 Luis Gómez
  - E003 Marta Ríos

Retirar a Luis: true
Cupos disponibles: 1
Matricular a Carlos: true

--- Agregación: sin el curso, los objetos siguen existiendo ---
Germán Arias y Ana Torres siguen disponibles.
```
