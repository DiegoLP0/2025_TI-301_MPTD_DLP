
package Tema4.Ordenamiento;

import java.util.Random;

public class BubleSortTest {
    public static void main(String[] args) {
        
        // 1. Configuración del tamaño
        // NOTA: Con 1,000,000 esto tardará horas. 
        // Para probar que funciona rápido, cambia esto a 10,000.
        int cantidadDatos = 100000; 
        
        int[] datos = new int[cantidadDatos];
        
        // 2. Instanciar la clase que contiene el algoritmo
        BubleSort algoritmo = new BubleSort();

        // 3. Generar datos aleatorios
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);

        // 4. Ejecutar el ordenamiento y medir tiempo
        System.out.println("Iniciando ordenamiento Burbuja (Espere, por favor)...");
        long inicio = System.currentTimeMillis();

        // Llamada al método de la otra clase
        algoritmo.ordenarBurbuja(datos);

        long fin = System.currentTimeMillis();
        
        System.out.println("¡Ordenamiento finalizado!");
        System.out.println("Tiempo total: " + (fin - inicio) / 1000.0 + " segundos.");
    }

    // Método auxiliar para llenar el arreglo
    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(); // Genera cualquier entero posible
        }
    }
}
