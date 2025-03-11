/*
 * ITESS-TICS-MATEMATICAS DISCRETAS II PERIODO:ENERO-JUNIO-2025
 * GRUPO:TI-202 DOCENTE:FRANCISCO JAVIER PROGRAMADOR:DIEGO LEYVA PANIAGUA
 * DESCRIPCION: CLASE GRAFO
 * 17/02/2025
 */
package tema1grafos;

import java.util.ArrayList;
import java.util.List;

public class GrafoC {

    private List<Integer> v;
    private List<List<Integer>> e;
    private List<Integer> w;

    public GrafoC() {
        v = new ArrayList<>();
        e = new ArrayList<>();
        w = new ArrayList<>();
    }

    private void initVE(int[] v, int[][] e) {
        this.v = new ArrayList<>();
        this.e = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            this.v.add(v[i]);
        }

        for (int i = 0; i < e.length; i++) {
            ArrayList<Integer> arista = new ArrayList<>();
            arista.add(e[i][0]);
            arista.add(e[i][1]);
            this.e.add(arista);
        }
    }

    public GrafoC(int[] v, int[][] e) {
        initVE(v, e);
    }

    public GrafoC(int[] v, int[][] e, int[] w) {
        initVE(v, e);
        this.w = new ArrayList<>();
        for (int i = 0; i < w.length; i++) {
            this.w.add(w[i]);
        }
    }

    public void agrgarVertice(int v) {
        this.v.add(v);
    }

    public void agrgarArista(int u, int v, int w) {
        ArrayList<Integer> arista = new ArrayList<>();
        arista.add(u);
        arista.add(v);
        this.e.add(arista);
        this.w.add(w);
    }

    public int grado(int v) {
        /*
        boolean vValid = false;
        for (Integer v1 : this.v) {
            if (v1 == v){
                vValid=true;
                break;
            }
        }
         */
        if (!this.v.contains(v)) {
            return -1;
        }

        int grado = 0;
        int gradototal;
        for (List<Integer> arista : this.e) {
            if (arista.get(0) == v) {
                grado++;
            }
            if (arista.get(1) == v) {
                grado++;
            }
            gradototal = grado + grado;
        }
        return grado;
    }

    public int gradoTotal() {
        int gradoTotal = 0;
        for (Integer v : this.v) {
            gradoTotal += grado(v);
        }
        return gradoTotal;
    }

    public void dijkstra() {

    }

    @Override
    public String toString() {
        return "GrafoC{" + "v=" + v.toString() + ", e=" + e.toString() + '}';
    }

}
