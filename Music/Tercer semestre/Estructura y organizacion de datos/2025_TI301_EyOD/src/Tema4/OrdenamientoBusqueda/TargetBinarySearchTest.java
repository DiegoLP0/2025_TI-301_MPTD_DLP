
package Tema4.OrdenamientoBusqueda;

import java.util.Random;

public class TargetBinarySearchTest {
    public static void main(String[] args) {
        
        // 1. Configuración
        int cantidadDatos = 1000000;
        int[] datos = new int[cantidadDatos];
        
        // 2. Instanciar la lógica
        TargetBinarySearch algoritmo = new TargetBinarySearch();

        // 3. Generar datos aleatorios
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);

        // Elegimos un número al azar PARA ASEGURARNOS de que exista en la prueba
        // (Tomamos el que quedó en la posición 500 para buscarlo después)
        int target = datos[500]; 
        System.out.println("El número objetivo a buscar será: " + target);

        // 4. PRIMERO: Ordenar (Requisito obligatorio para Binary Search)
        System.out.println("Ordenando el arreglo (QuickSort)...");
        long inicioSort = System.currentTimeMillis();
        
        algoritmo.ordenarDatos(datos);
        
        long finSort = System.currentTimeMillis();
        System.out.println("Ordenado en: " + (finSort - inicioSort) + " ms.");

        // 5. SEGUNDO: Aplicar Búsqueda Binaria
        System.out.println("Iniciando Búsqueda Binaria...");
        long inicioSearch = System.currentTimeMillis();

        int resultado = algoritmo.busquedaBinaria(datos, target);

        long finSearch = System.currentTimeMillis();

        if (resultado != -1) {
            System.out.println("¡Encontrado! El número " + target + " ahora está en el índice: " + resultado);
        } else {
            System.out.println("El número no se encontró.");
        }
        
        System.out.println("Tiempo de búsqueda: " + (finSearch - inicioSearch) + " ms.");
    }

    // Método auxiliar para llenar
    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000000); // Números entre 0 y 10 millones
        }
    }
}
