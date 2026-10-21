# pry_burbuja

**Alumno:** Angel Josue Domingo Guillen
**Grupo:** 4 C
**Matrícula:** 20251011

## Descripción

Programa en Java que ordena un arreglo de enteros de menor a mayor con el método de **burbuja**, en dos versiones:

- **`ordenamientoBurbuja`** (tradicional): siempre hace `n - 1` pasadas recorriendo el arreglo completo.
- **`ordenamientoBurbujaMejorado`** (optimizado): usa la bandera `huboIntercambio`; si en una pasada no hubo ningún intercambio, el arreglo ya está ordenado y se detiene con `break`.

Cada método muestra cuántas pasadas realizó, para comparar su eficiencia.

## Estructura

```
pry_burbuja
└── src/main/java/ordenamiento/Burbuja.java
```

## Ejecución

Abrir el proyecto en NetBeans y ejecutar.

```
Arreglo original: [1, 2, 3, 5, 4, 6, 7, 8]

Burbuja tradicional:
Pasadas realizadas (tradicional): 7
Resultado: [1, 2, 3, 4, 5, 6, 7, 8]

Burbuja mejorado::
Pasadas realizadas (mejorado): 2
Resultado: [1, 2, 3, 4, 5, 6, 7, 8]