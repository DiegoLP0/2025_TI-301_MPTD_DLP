/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 3. Estructuras no Lineales
*      adyacenci list 
* Problem: Binary Search
* Descripcion: Buscar un objetivo en un arreglo ordenado
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 26/Nomviembre/2025
*
 */
package Tema3.EstructurasNoLineales;

import java.util.ArrayList;
import java.util.List;

public class GraphAdyasenci {

    private List<List<Integer>> graph;
    private int n; // Numero de vertices

    public GraphAdyasenci(int n) {
        this.n = n;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void print() {
        int node = 0;
        for (var al : graph) {
            System.out.print(node + ":");
            for (var i : al) {
                System.out.print(i + ", ");
            }
            node++;
            System.out.println("");
        }
    }
    
    public int depth(int p) {
        if (p == 0)
        return 0;
        
        return 1 + depth(graph.get(p).get(0)); 
    }
}
