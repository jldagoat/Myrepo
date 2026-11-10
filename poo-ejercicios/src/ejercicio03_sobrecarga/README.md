# Ejercicio 3 – Sobrecarga de constructores y métodos

## Enunciado

Un rectángulo se puede crear de tres formas: sin datos (1 x 1), con un solo lado (cuadrado) o con base y altura. Además se puede escalar con un solo factor o con un factor para la base y otro para la altura. Implementarlo con sobrecarga de constructores (usando `this(...)`) y de métodos.

## Conceptos de POO que se practican

- Sobrecarga de constructores
- Encadenamiento con `this(...)`
- Sobrecarga de métodos
- `toString`

## Archivos

- `Rectangulo.java`: Constructores y métodos sobrecargados.
- `Main.java`: Prueba cada variante.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio03_sobrecarga/*.java
java -cp out ejercicio03_sobrecarga.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Constructor sin parámetros: Rectángulo 1,0 x 1,0 (área 1,00, perímetro 4,00, cuadrado)
Constructor con un lado:    Rectángulo 4,0 x 4,0 (área 16,00, perímetro 16,00, cuadrado)
Constructor con base y altura: Rectángulo 6,0 x 3,5 (área 21,00, perímetro 19,00)

--- Método escalar sobrecargado ---
escalar(2):    Rectángulo 12,0 x 7,0 (área 84,00, perímetro 38,00)
escalar(1, 3): Rectángulo 12,0 x 21,0 (área 252,00, perímetro 66,00)

Rectangulo(-2, 5) -> Las medidas deben ser mayores que cero.
```
