
package Tema4.Ordenamiento;

import java.util.Random;

public class QSortTest {
    public static void main(String[] args) {
        
        // ¡AHORA SÍ! QuickSort puede manejar 1 millón sin problemas.
        int cantidadDatos = 10; 
        
        int[] datos = new int[cantidadDatos];
        QSort algoritmo = new QSort();

        // 1. Generar datos
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);

        // Mostrar muestra antes de ordenar
        mostrarMuestra(datos, "Muestra ANTES de ordenar (primeros 20):");

        // 2. Ordenar
        System.out.println("\nIniciando QuickSort... (¡No parpadees!)");
        long inicio = System.currentTimeMillis();
        
        // Llamamos al nuevo método
        algoritmo.ordenarQuickSort(datos);
        
        long fin = System.currentTimeMillis();

        // Mostrar muestra después de ordenar
        mostrarMuestra(datos, "Muestra DESPUÉS de ordenar (primeros 20):");
        
        System.out.println("\n¡Proceso terminado!");
        double tiempoSegundos = (fin - inicio) / 1000.0;
        System.out.println("Tiempo total: " + tiempoSegundos + " segundos.");
        System.out.println("Comparación: ¡Burbuja habría tardado horas!");
    }

    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000); 
        }
    }

    private static void mostrarMuestra(int[] arr, String mensaje) {
        System.out.println("--------------------------------------------------");
        System.out.println(mensaje);
        int cantidadAVer = 20;
        int limite = Math.min(arr.length, cantidadAVer); 

        System.out.print("[ ");
        for (int i = 0; i < limite; i++) {
            System.out.print(arr[i]);
            if (i < limite - 1) System.out.print(", ");
        }
        System.out.println(" ... ]");
        System.out.println("--------------------------------------------------");
    }
}
