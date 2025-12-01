/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 3. Estructuras  no Lineales
*      3.1 Recursividad
* Problem: Binary Search
* Descripcion: Buscar un objetivo en un arreglo ordenado
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 19/Nomviembre/2025
*
*/

package Tema3.EstructurasNoLineales;

public class binarySearch {
    public static void main(String[] args) {
        int [] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println(binarySearch (valores, 14, 2, 29));
    }
    
    public static boolean binarySearch (int [] data, int target, int low, int high) {
        if (low > high)
            return false;
        else {
            int mid = (low + high ) / 2 ;
            if (target == data[mid])
                return true;
            else if (target < data[mid])
                return binarySearch (data, target, low, mid -1);
            else 
                return binarySearch (data, target, mid + 1, high);
        }
    }
}
