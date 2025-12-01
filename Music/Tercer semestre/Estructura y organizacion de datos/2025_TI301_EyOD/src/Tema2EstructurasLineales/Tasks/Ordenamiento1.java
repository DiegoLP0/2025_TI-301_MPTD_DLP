package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento1 {
    public static void main(String[] args) {
        System.out.println("Leyva Paniagua Diego");
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una list que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

        Collections.sort(lista); // ordena ArrayList
        System.out.printf("Elementos del arreglo ordenados: %s%n", lista);
    } // fin de main
}
