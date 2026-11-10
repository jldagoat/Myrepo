# Ejercicio 10 – Enumeraciones y excepciones personalizadas

## Enunciado

Un parqueadero tiene capacidad limitada. Cada vehículo es de un tipo (moto, carro o bus) con una tarifa por hora definida en un `enum`. Se cobra por hora o fracción. Si el parqueadero está lleno se lanza `ParqueaderoLlenoException`; si se intenta sacar un vehículo que no está se lanza `VehiculoNoEncontradoException`. Ambas son excepciones propias.

## Conceptos de POO que se practican

- `enum` con atributos y constructor
- Excepciones propias (`extends Exception`)
- `throws` y `try/catch` con varios `catch`
- Cobro por hora o fracción (`Math.ceil`)

## Archivos

- `TipoVehiculo.java`: Enumeración con la tarifa por hora.
- `Vehiculo.java`: Placa y tipo.
- `ParqueaderoLlenoException.java`: Excepción propia.
- `VehiculoNoEncontradoException.java`: Excepción propia.
- `Parqueadero.java`: Ingreso, salida y cobro.
- `Main.java`: Casos válidos y con error.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio10_enum_excepciones/*.java
java -cp out ejercicio10_enum_excepciones.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
=== Tarifas por hora (enum TipoVehiculo) ===
MOTO: $1.500
CARRO: $3.000
BUS: $6.000

Ingresa ABC123 (CARRO). Espacios libres: 2
Ingresa XYZ98A (MOTO). Espacios libres: 1
Ingresa BUS456 (BUS). Espacios libres: 0
No ingresa DEF789: El parqueadero está lleno (capacidad: 3).

Ingreso repetido: El vehículo ABC123 ya está dentro.

Sale ABC123 tras 125 min. Cobro: $9.000
Sale XYZ98A tras 40 min. Cobro: $1.500
Error: No hay ningún vehículo con placa QQQ000 en el parqueadero.
Espacios libres al final: 2
```
