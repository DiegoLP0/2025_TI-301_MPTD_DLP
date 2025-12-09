
package Tema4.OrdenamientoBusqueda;

import java.util.Arrays;

public class TargetBinarySearch {
    public void ordenarDatos(int[] arreglo) {
        Arrays.sort(arreglo);
    }

    // Método 2: Algoritmo de Búsqueda Binaria
    public int busquedaBinaria(int[] arreglo, int target) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            // Calculamos la mitad
            int medio = izquierda + (derecha - izquierda) / 2;

            // Caso 1: Encontramos el valor justo en medio
            if (arreglo[medio] == target) {
                return medio;
            }

            // Caso 2: El valor buscado es mayor, descartamos la mitad izquierda
            if (arreglo[medio] < target) {
                izquierda = medio + 1;
            } 
            // Caso 3: El valor buscado es menor, descartamos la mitad derecha
            else {
                derecha = medio - 1;
            }
        }

        // Si salimos del ciclo, el valor no existe
        return -1;
    }
}
