
package Tema4.Ordenamiento;

public class QSort {
    public void ordenarQuickSort(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length - 1);
    }

    // Método recursivo principal de QuickSort
    private void quickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            // Encontrar el índice de partición
            int pi = particion(arr, bajo, alto);

            // Ordenar recursivamente los elementos antes y después de la partición
            quickSort(arr, bajo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    // Método auxiliar para colocar el pivote en su posición correcta
    private int particion(int[] arr, int bajo, int alto) {
        // Elegimos el último elemento como pivote
        int pivote = arr[alto]; 
        int i = (bajo - 1); // Índice del elemento más pequeño

        for (int j = bajo; j < alto; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivote) {
                i++;

                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar arr[i+1] y arr[alto] (el pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }
}
