# Ejercicio 4 – Miembros estáticos

## Enunciado

Cada `Estudiante` tiene nombre y nota final. La clase debe llevar la cuenta de cuántos estudiantes se han creado, definir la nota mínima para aprobar como constante y calcular el promedio de un grupo con un método estático. Crear también una clase `Utilidades` con métodos estáticos (par, factorial y máximo de un arreglo) que se usen sin crear objetos.

## Conceptos de POO que se practican

- Atributo `static` (contador compartido)
- Constante `static final`
- Métodos `static`
- Constructor privado en clase de utilidades

## Archivos

- `Estudiante.java`: Contador y constante estáticos.
- `Utilidades.java`: Métodos estáticos sin estado.
- `Main.java`: Usa ambas clases.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio04_static/*.java
java -cp out ejercicio04_static.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Estudiantes creados al inicio: 0
Estudiantes creados después: 4
Nota mínima para aprobar: 3,0

Ana Torres -> 4,5 (aprobó)
Luis Gómez -> 2,8 (reprobó)
Marta Ríos -> 3,0 (aprobó)
Carlos Peña -> 3,9 (aprobó)
Promedio del grupo: 3,55

--- Métodos estáticos de Utilidades (sin crear objetos) ---
esPar(7): false
factorial(10): 3628800
maximo({4, 17, 9, 12}): 17
```
