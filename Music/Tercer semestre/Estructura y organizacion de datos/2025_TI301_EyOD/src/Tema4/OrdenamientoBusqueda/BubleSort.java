
package Tema4.OrdenamientoBusqueda;

public class BubleSort {
    public void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio (Swap)
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }

            // Si en una pasada no hubo intercambios, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
}
