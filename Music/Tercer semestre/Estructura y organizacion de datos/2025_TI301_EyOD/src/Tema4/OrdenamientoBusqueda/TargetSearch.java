package Tema4.OrdenamientoBusqueda;

public class TargetSearch {
    public int buscarElemento(int[] arreglo, int target) {
        int n = arreglo.length;

        // Recorremos todo el arreglo uno por uno
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == target) {
                // Si encontramos el elemento, regresamos su posición (índice)
                return i;
            }
        }

        // Si terminamos el ciclo y no lo encontramos, regresamos -1
        return -1;
    }
}
