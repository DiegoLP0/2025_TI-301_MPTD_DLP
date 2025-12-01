package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.LinkedList;

public class UsoToArray {
// el constructor crea un objeto LinkedList, le agrega elementos y lo
    // convierte en arreglo
    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        String[] colors = {"negro", "azul", "amarillo"};
        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colors));

        enlaces.addLast("rojo"); // lo agrega como último elemento
        enlaces.add("rosa"); // lo agrega al final
        enlaces.add(3, "verde"); // lo agrega en el 3er indice
        enlaces.addFirst("cyan"); // lo agrega como primer elemento

        // obtiene los elementos de LinkedList como un arreglo
        colors = enlaces.toArray(new String[enlaces.size()]);
        
        System.out.println("colores: ");

        for (String color : colors)
            System.out.println(color);
            
    } // fin de la clase UsoToArray    
}
