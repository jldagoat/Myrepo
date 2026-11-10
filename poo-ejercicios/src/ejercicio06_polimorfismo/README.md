# Ejercicio 6 – Clases abstractas y polimorfismo

## Enunciado

Una figura geométrica tiene un nombre, un área y un perímetro. Crear la clase abstracta `Figura` y las clases `Circulo`, `Rectangulo` y `Triangulo`. Guardarlas en un solo arreglo de tipo `Figura`, mostrar la información de cada una, el área total y la figura de mayor área.

## Conceptos de POO que se practican

- Clase abstracta y métodos abstractos
- Polimorfismo (arreglo de tipo `Figura`)
- Constructor protegido
- Validación del triángulo

## Archivos

- `Figura.java`: Clase abstracta.
- `Circulo.java`: Figura con radio.
- `Rectangulo.java`: Figura con base y altura.
- `Triangulo.java`: Figura con tres lados (fórmula de Herón).
- `Main.java`: Recorre las figuras de forma polimórfica.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio06_polimorfismo/*.java
java -cp out ejercicio06_polimorfismo.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
=== Figuras (un solo arreglo de tipo Figura) ===
Círculo    área:    78,54 | perímetro:   31,42
Rectángulo área:    24,00 | perímetro:   20,00
Triángulo  área:     6,00 | perímetro:   12,00
Círculo    área:     7,07 | perímetro:    9,42
Rectángulo área:     4,00 | perímetro:    8,00

Área total: 119,61
Figura de mayor área: Círculo (78,54)

Triangulo(1, 2, 10) -> Los lados no forman un triángulo válido.
```
