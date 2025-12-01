package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        // crea un TreeSet del arreglo colores
        String[] colores = {"amarillo", "verde", "negro", "carne", "gris",
            "blanco", "naranja", "rojo", "verde"};
        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));

        System.out.print("conjunto ordenado: ");
        imprimirConjunto(arbol);

        // obtiene subconjunto mediante headSet, con base en "naranja"
        System.out.print("headSet (\"naranja\"): ");
        imprimirConjunto(arbol.headSet("naranja"));

        // obtiene subconjunto mediante tailSet, con base en "naranja"
        System.out.print("tailSet (\"naranja\"): ");
        imprimirConjunto(arbol.tailSet("naranja"));

        // obtiene los elementos primero y último
        System.out.printf("primero: %s%n", arbol.first());
        System.out.printf("ultimo : %s%n", arbol.last());
    } // fin de main

    // imprime SortedSet en pantalla mediante instrucción for mejorada
    private static void imprimirConjunto(SortedSet<String> conjunto)
    {
        for (String s : conjunto)
            System.out.printf("%s ", s);
            
        System.out.println();
    } // fin de imprimirConjunto
}
