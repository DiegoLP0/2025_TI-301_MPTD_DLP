/*
 * ITESS-TICS-MATEMATICAS DISCRETAS II PERIODO:ENERO-JUNIO-2025
 * GRUPO:TI-202 DOCENTE: FRANCISCO JAVIER PROGRAMADOR:DIEGO LEYVA PANIAGUA
 * DESCRIPCION: TEST HASHSET
 * 11/03/2025
 */

package EstructuraDeDatos;
 
import java.util.HashSet;


public class HashSetTest {
    public static void main(String []args){
        HashSet <Integer> a = new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        HashSet <Integer> b = new HashSet <Integer>();
        b.add(3);
        b.add(4);
        System.out.println(b);
        HashSet <Integer> union = new HashSet <Integer>();
        union.addAll(b);
        union.addAll(a);
        System.out.println(union);
        
    }
}
