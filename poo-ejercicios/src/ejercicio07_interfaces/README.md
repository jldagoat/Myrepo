# Ejercicio 7 – Interfaces

## Enunciado

Para ir al campus se puede usar Metro, Bus, Taxi o Bicicleta. Todos implementan la interfaz `MedioTransporte` (costo y tiempo de un viaje de N km); Metro y Bicicleta implementan además `Ecologico`. Dado un viaje de 8 km, mostrar el resumen de cada medio, el más barato, el más rápido y las emisiones de los ecológicos. Los valores de costo, velocidad y emisiones son de ejemplo.

## Conceptos de POO que se practican

- Interfaz (`interface` / `implements`)
- Método `default`
- Una clase con varias interfaces
- Polimorfismo con interfaces

## Archivos

- `MedioTransporte.java`: Interfaz con un método `default`.
- `Ecologico.java`: Segunda interfaz.
- `Metro.java`: Implementa las dos interfaces.
- `Bus.java`: Implementa `MedioTransporte`.
- `Taxi.java`: Implementa `MedioTransporte`.
- `Bicicleta.java`: Implementa las dos interfaces.
- `Main.java`: Compara los medios para 8 km.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio07_interfaces/*.java
java -cp out ejercicio07_interfaces.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
=== Viaje de 8 km hasta el campus ===
Metro      costo: $ 3.000 | tiempo:  14 min
Bus        costo: $ 2.800 | tiempo:  27 min
Taxi       costo: $20.200 | tiempo:  18 min
Bicicleta  costo: $     0 | tiempo:  32 min

Más barato: Bicicleta
Más rápido: Metro

--- Medios que además implementan Ecologico ---
Metro: 80 g de CO2
Bicicleta: 0 g de CO2
(Los valores de costo, velocidad y emisiones son de ejemplo.)
```
