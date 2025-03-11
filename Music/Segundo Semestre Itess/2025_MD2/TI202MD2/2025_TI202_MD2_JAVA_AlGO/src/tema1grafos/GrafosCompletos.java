/*
 * ITESS-TICS-MATEMATICAS DISCRETAS II PERIODO:ENERO-JUNIO-2025
 * GRUPO:TI-202 DOCENTE:FRANCISCO JAVIER PROGRAMADOR:DIEGO LEYVA PANIAGUA
 * DESCRIPCION: CLASE PARA GENREAR GRAFOS COMPLETOS
 * 24/02/2025
 */
package tema1grafos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrafosCompletos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de vértices: ");
        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>(n);

        // Inicializar listas de adyacencia
        for (int i = 0; i < n; i++) {
            grafo.add(new ArrayList<>());
        }

        // Crear el grafo completo
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                grafo.get(i).add(j);
                grafo.get(j).add(i);
            }
        }

        // Mostrar las aristas como pares ordenados
        System.out.println("Aristas del grafo completo:");
        for (int i = 0; i < n; i++) {
            for (int j : grafo.get(i)) {
                if (i < j) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
