# Ejercicio 5 – Herencia

## Enunciado

Una empresa tiene empleados, desarrolladores y gerentes. El desarrollador gana su salario base más un valor fijo por cada hora extra; el gerente gana su salario base más un bono. Implementarlo con herencia, `super` y sobrescritura (`@Override`) de `calcularSalario`, `presentarse` y `toString`.

## Conceptos de POO que se practican

- Herencia (`extends`)
- `super` en constructores y métodos
- Sobrescritura (`@Override`)
- Operador `instanceof`

## Archivos

- `Empleado.java`: Clase padre.
- `Desarrollador.java`: Hija: suma horas extra.
- `Gerente.java`: Hija: suma un bono.
- `Main.java`: Prueba las tres clases.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio05_herencia/*.java
java -cp out ejercicio05_herencia.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Pedro Ruiz (CC 1020304050)
Hola, soy Pedro Ruiz y trabajo en la empresa.
Salario: $2.000.000

Laura Gómez (CC 1017654321) - Desarrollador
Hola, soy Laura Gómez y trabajo en la empresa. Programo en Java.
Salario (base + 10 horas extra): $3.750.000

Sofía Mejía (CC 43210987) - Gerente
Hola, soy Sofía Mejía y trabajo en la empresa. Dirijo un equipo de 8 personas.
Salario (base + bono): $7.500.000

--- Relación 'es un' ---
dev instanceof Empleado: true
gerente instanceof Empleado: true
empleado instanceof Gerente: false
```
