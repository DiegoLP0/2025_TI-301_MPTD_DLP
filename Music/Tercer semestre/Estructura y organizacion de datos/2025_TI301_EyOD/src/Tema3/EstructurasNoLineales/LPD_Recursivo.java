/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 3. Estructuras  no Lineales
*      3.1 Recursividad
* Problem: Imprimir N veces mi nombre
* Descripcion: Algoritmo para detectar la cantidad de dias 
*              hasta encontrar un dia mas caluroso
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 12/Nomviembre/2025
*
*/

package Tema3.EstructurasNoLineales;

public class LPD_Recursivo {
    public static int count = 0;
    
    public static void main(String[] args) {
        printName(5, "DLP");
    }
    
    public static void printName(int n, String name){
        if (count > n ){
            count = 0;
            return ;
        }
        
        System.out.println(count + ": " + name);
        count ++;
        printName(n, name);
    }
}
