# Ejercicio 2 – Encapsulamiento

## Enunciado

Una cuenta bancaria guarda su número, su titular y su saldo. Ningún dato puede modificarse directamente desde fuera de la clase. Solo se puede depositar o retirar montos mayores que cero y no se puede retirar más que el saldo. Si una operación no es válida se lanza `IllegalArgumentException`. En `Main` mostrar operaciones válidas e inválidas capturando la excepción.

## Conceptos de POO que se practican

- Encapsulamiento (`private`)
- Métodos de acceso sin `set`
- Validación en constructor y métodos
- `IllegalArgumentException` con `try/catch`

## Archivos

- `CuentaBancaria.java`: Cuenta con saldo privado y validaciones.
- `Main.java`: Operaciones válidas e inválidas.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio02_encapsulamiento/*.java
java -cp out ejercicio02_encapsulamiento.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Cuenta 001-234 de Ana Torres
Saldo inicial: $500.000
Después de depositar $250.000: $750.000
Después de retirar $100.000: $650.000

--- Operaciones inválidas ---
Retirar $2.000.000 -> Fondos insuficientes: el saldo es $650.000.
Depositar -$50 -> El monto a depositar debe ser mayor que cero.
Crear cuenta con saldo negativo -> El saldo inicial no puede ser negativo.

Saldo final: $650.000
```
