package Metodos_de_ordenamiento;

public class MainBurbuja {
    public static void main(String[] args) {
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        Burbuja.imprimirArreglo(arreglo);

        Burbuja.ordenar(arreglo);

        System.out.println("Arreglo ordenado por Burbuja:");
        Burbuja.imprimirArreglo(arreglo);
    }
}
