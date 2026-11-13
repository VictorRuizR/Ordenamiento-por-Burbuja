# Ordenamiento por Burbuja en Java

Implementación en Java del algoritmo de ordenamiento por burbuja (Bubble Sort), realizada para la Unidad 5 de la materia de Estructura de Datos. El programa ordena un arreglo de números enteros de menor a mayor y muestra en consola el arreglo original y el arreglo ya ordenado.

## ¿Qué hace el ordenamiento por burbuja?

El ordenamiento por burbuja ordena una lista comparando cada elemento con el que tiene justo al lado. Si los dos están en el orden incorrecto, los intercambia y sigue avanzando.

Al repetir este recorrido varias veces, los valores más grandes van «subiendo» poco a poco hasta el final del arreglo, como las burbujas en un líquido. De ahí viene su nombre. Cuando se completa una pasada entera sin hacer ningún intercambio, el arreglo ya está ordenado y el programa se detiene.

Es un algoritmo sencillo de entender e implementar. No es el más rápido para listas muy grandes, pero es ideal para aprender cómo funcionan los algoritmos de ordenamiento.

## ¿Cómo funciona?

1. Se recorre el arreglo desde el inicio, comparando cada par de elementos vecinos: `arr[j]` y `arr[j + 1]`.
2. Si el elemento de la izquierda es mayor que el de la derecha (`arr[j] > arr[j + 1]`), se intercambian usando una variable temporal.
3. Al terminar la primera pasada, el número más grande queda en la última posición, por lo que la siguiente pasada recorre un elemento menos.
4. El proceso se repite hasta ordenar todo el arreglo.
5. Si en una pasada no se hace ningún intercambio, el arreglo ya está ordenado y el algoritmo termina antes. Esta mejora se controla con la variable `intercambiado` en la clase `Burbuja`.

### Ejemplo

Con el arreglo de ejemplo del programa:

- Arreglo original: `[6, 1, 5, 8, 3, 2, 7, 4]`
- En la primera pasada, el 6 se intercambia con el 1 y con el 5, el 8 avanza hasta el final y el resto de elementos se va acomodando.
- Tras las pasadas siguientes, los valores grandes ocupan las últimas posiciones y los pequeños quedan al inicio.
- Arreglo ordenado: `[1, 2, 3, 4, 5, 6, 7, 8]`

## Complejidad

| Caso | Complejidad temporal |
| --- | ---: |
| Mejor caso (arreglo ya ordenado) | O(n) |
| Caso promedio | O(n²) |
| Peor caso | O(n²) |

- Memoria adicional: O(1), porque ordena el arreglo en su mismo lugar y solo usa una variable temporal para los intercambios.
- Es un algoritmo estable: los elementos con el mismo valor conservan su orden original.

## Estructura del proyecto

```text
Metodos_de_Ordenamiento/
├── Burbuja.java
└── MainBurbuja.java
```

- `Burbuja.java`: contiene el método `ordenar(int[] arr)`, que aplica el ordenamiento por burbuja, y el método `imprimirArreglo(int[] arr)`, que muestra el arreglo en consola con el formato `[1, 2, 3]`.
- `MainBurbuja.java`: es la clase principal. Crea el arreglo de ejemplo `{6, 1, 5, 8, 3, 2, 7, 4}`, lo imprime, llama a `Burbuja.ordenar(arreglo)` y vuelve a imprimirlo ya ordenado.

Ambas clases pertenecen al paquete `Metodos_de_Ordenamiento`.

## Requisitos

- Java Development Kit (JDK) instalado.
- IntelliJ IDEA u otro editor, o bien una terminal para compilar desde la línea de comandos.

## Cómo clonar, compilar y ejecutar

### 1. Clonar el repositorio

```bash
git clone <url-del-repositorio>
cd <nombre-del-repositorio>
```

### 2. Ejecutar desde IntelliJ IDEA

1. Abre el proyecto en IntelliJ IDEA.
2. Localiza la clase `MainBurbuja` dentro del paquete `Metodos_de_Ordenamiento`.
3. Haz clic en el botón de ejecución junto al método `main` o pulsa **Run**.

### 3. Ejecutar desde la terminal

Desde la carpeta que contiene el paquete `Metodos_de_Ordenamiento`:

```bash
javac Metodos_de_Ordenamiento/Burbuja.java Metodos_de_Ordenamiento/MainBurbuja.java
java Metodos_de_Ordenamiento.MainBurbuja
```

## Salida en consola

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado por Burbuja:
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Autor

- **Autor:** Victor Ruiz Ruiz
- **Número de control:** C257O04133
- **Docente:** Víctor Hugo Vásquez Herrera
- **Materia:** Estructura de Datos (AED-1026) — Unidad 5
- **Instituto:** Instituto Tecnológico Superior de Xalapa
- **Carrera:** Ingeniería en Sistemas Computacionales
