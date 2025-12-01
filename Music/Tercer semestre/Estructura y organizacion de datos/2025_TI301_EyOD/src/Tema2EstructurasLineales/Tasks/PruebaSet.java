package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaSet {
    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        // crea y muestra un objeto List<String>
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris",
            "naranja", "carne", "blanco", "cyan", "durazno", "gris", "naranja"};
        List<String> lista = Arrays.asList(colores);
        System.out.printf("List: %s%n", lista);

        // elimina duplicados y luego imprime los valores unicos
        imprimirSinDuplicados(lista);
    } // fin de main

    // crea un objeto Set a partir de un objeto Collection para eliminar duplicados
    private static void imprimirSinDuplicados(Collection<String> valores)
    {
        // crea un objeto HashSet
        Set<String> conjunto = new HashSet<>(valores);

        System.out.printf("%nLos valores sin duplicados son: ");

        for (String valor : conjunto)
            System.out.printf("%s ", valor);

        System.out.println();
    } // fin de imprimirSinDuplicados
}
