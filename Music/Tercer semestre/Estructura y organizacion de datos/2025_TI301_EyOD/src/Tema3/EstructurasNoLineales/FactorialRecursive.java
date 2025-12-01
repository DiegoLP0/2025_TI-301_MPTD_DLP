/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 3. Estructuras  no Lineales
*      3.1 Recursividad
* Problem: 
* Descripcion: hacer un factorial sin fors
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 12/Nomviembre/2025
*
 */
package Tema3.EstructurasNoLineales;

public class FactorialRecursive {

    public static void main(String[] args) {
        System.out.println("n! : " + factN(5));
    }

    public static int factN(int n) {
        if (n == 0) 
            return 1;
        
        return n*factN(n-1);
    }
}
