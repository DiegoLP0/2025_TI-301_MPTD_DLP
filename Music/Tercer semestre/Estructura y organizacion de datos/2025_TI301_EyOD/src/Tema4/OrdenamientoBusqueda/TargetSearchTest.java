package Tema4.OrdenamientoBusqueda;

import java.util.Random;

public class TargetSearchTest {
public static void main(String[] args) {
        
        // 1. Configuración del tamaño
        // Pediste 1,000,000 de datos.
        int cantidadDatos = 1000000; 
        int target = 999; // El número que queremos buscar
        
        int[] datos = new int[cantidadDatos];
        
        // 2. Instanciar la clase que contiene el algoritmo
        TargetSearch algoritmo = new TargetSearch();

        // 3. Generar datos aleatorios
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);
        
        // Opcional: Forzamos que el número exista en la última posición para el peor caso
        // datos[cantidadDatos - 1] = target; 

        // 4. Ejecutar la búsqueda y medir tiempo
        System.out.println("Buscando el número " + target + " (Espere, por favor)...");
        long inicio = System.currentTimeMillis();

        // Llamada al método de la otra clase
        int resultado = algoritmo.buscarElemento(datos, target);

        long fin = System.currentTimeMillis();
        
        if (resultado != -1) {
            System.out.println("¡Elemento encontrado en el índice: " + resultado + "!");
        } else {
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
        
        System.out.println("Tiempo total: " + (fin - inicio) + " milisegundos.");
    }

    // Método auxiliar para llenar el arreglo
    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(); // Genera cualquier entero posible
        }
    }    
}
