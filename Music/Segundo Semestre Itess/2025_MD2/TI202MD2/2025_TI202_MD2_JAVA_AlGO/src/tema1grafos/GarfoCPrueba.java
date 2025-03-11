/*
 * ITESS-TICS-MATEMATICAS DISCRETAS II PERIODO:ENERO-JUNIO-2025
 * GRUPO:TI-202 DOCENTE:FRANCISCO JAVIER PROGRAMADOR:DIEGO LEYVA PANIAGUA
 * DESCRIPCION: CLASE GRAFO TESTEO
 * 17/02/2025
 */
package tema1grafos;

public class GarfoCPrueba {
   public static void main (String [] args){
       System.out.println("Crea un grafo sin vertices ni aristas:::::::::::");
       GrafoC g1 = new GrafoC();
       System.out.println(g1.toString());
       
       System.out.println("Crea un grafo con vertices y aristas:::::::::::");
       int[]v ={1,2,3};
       int[][]e ={{1,2},{2,3},{3,4}};
       GrafoC g2 = new GrafoC(v,e);
       System.out.println(g2.toString());
       
       System.out.println("Agregar vertices y aristas");
       g1.agrgarVertice(1);
       g1.agrgarVertice(2);
       g1.agrgarArista(1,2);
       System.out.println(g1.toString());
       
       System.out.println("Probar grado de un vertice ::::::::::::::::");
       GrafoC g3 = new GrafoC();
       g3.agrgarVertice(1);
       g3.agrgarVertice(2);
       g3.agrgarVertice(3);
       
       g3.agrgarArista(1, 1);
       g3.agrgarArista(1, 2);
       System.out.println("grado(1)=" + g3.grado(1));
       System.out.println("grado(2)=" + g3.grado(2));
       System.out.println("grado(3)=" + g3.grado(3));
       System.out.println("grado(4)=" + g3.grado(4));
       
       
       System.out.println("gradoTotal de g3 = " + g3.gradoTotal());
       
   } 
   
}
