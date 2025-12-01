package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento2 {
    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una lista que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos); // crea objeto List
        System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

        // ordena en forma descendente, utilizando un comparador
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos de lista ordenados: %s%n", lista);
    } // fin de main
}
