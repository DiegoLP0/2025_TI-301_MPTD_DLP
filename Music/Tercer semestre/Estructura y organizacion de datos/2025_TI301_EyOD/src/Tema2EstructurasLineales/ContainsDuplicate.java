/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 2. Estructuras Lineales
*      2.1 Lista
* Problem: Contains Duplicate
* Descripcion: Algoritmo para detectara duplicados
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 17/Octubre/2025
*
*/

package Tema2EstructurasLineales;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int n = 10; // Cantidad de numeros
        int m = 30; // Rango de los numeros generados
        List <Integer> nums = generateInteger(n, m);
        print(nums);
        System.out.println("Contains duplicate " + containsDuplicate(nums));
        
    }
           
    public static boolean containsDuplicate (List <Integer> nums){
        for(int i = 0; i < nums.size() - 1; i++){
            for(int j = i+1; j < nums.size(); j++){
                if (Objects.equals(nums.get(i), nums.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static List <Integer> generateInteger(int n, int m){
        List <Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            nums.add((int) (Math.random() * m));
        }
        return nums;
    }
    
    public static void print(List<Integer> nums){
        System.out.println(nums.toString());
    }
}
