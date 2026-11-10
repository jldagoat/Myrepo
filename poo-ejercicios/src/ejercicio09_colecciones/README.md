# Ejercicio 9 – Colecciones de objetos

## Enunciado

Una cafetería universitaria necesita un inventario: agregar productos (sin repetir código), buscarlos, eliminarlos, calcular el valor total, listar los de stock bajo y mostrar los productos ordenados por precio. Usar `ArrayList` y `Comparator`.

## Conceptos de POO que se practican

- `ArrayList` de objetos
- Búsqueda y filtrado con ciclos
- `Comparator` para ordenar
- Copia defensiva de la lista

## Archivos

- `Producto.java`: Producto con venta y reabastecimiento.
- `Inventario.java`: Colección de productos y consultas.
- `Main.java`: Prueba el inventario.

## Cómo ejecutarlo

En VS Code: abrir `Main.java` y pulsar **Run** (aparece encima de `main`).

Por terminal, desde la carpeta raíz del repositorio:

```
javac -encoding UTF-8 -d out src/ejercicio09_colecciones/*.java
java -cp out ejercicio09_colecciones.Main
```

## Salida

Salida obtenida al ejecutar el programa:

```
Agregar un código repetido: false

=== Inventario (5 productos) ===
C01   Café americano     $  3.500  x  40
E01   Empanada           $  2.800  x   6
J01   Jugo natural       $  4.500  x  25
S01   Sándwich           $  7.200  x   4
G01   Galletas           $  1.500  x  60
Valor total del inventario: $388.100

=== Ordenados por precio (menor a mayor) ===
G01   Galletas           $  1.500  x  60
E01   Empanada           $  2.800  x   6
C01   Café americano     $  3.500  x  40
J01   Jugo natural       $  4.500  x  25
S01   Sándwich           $  7.200  x   4

=== Stock bajo (5 unidades o menos) ===
S01   Sándwich           $  7.200  x   4

Se venden 3 sándwiches. Quedan: 1
No se pueden vender 10 unidades de Sándwich (hay 1).
Eliminar G01: true
Eliminar X99: false
Productos restantes: 4
```
