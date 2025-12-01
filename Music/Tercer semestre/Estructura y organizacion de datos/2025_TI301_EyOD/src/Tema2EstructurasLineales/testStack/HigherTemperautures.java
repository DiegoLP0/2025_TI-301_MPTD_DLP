/*
* Itess-Tics 2025 Estructura y organizacion de datos
* Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
* Tema 2. Estructuras Lineales
*      2.1 Lista
*      2.2 Stack
* Problem: Higher Temperature
* Descripcion: Algoritmo para detectar la cantidad de dias 
*              hasta encontrar un dia mas caluroso
* Programador: Inge-far DLP
* Email: leyvadiego016@gmail.com
* Fecha: 22/Octubre/2025
*
 */
package Tema2EstructurasLineales.testStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HigherTemperautures {

    public static void main(String[] args) {
        // Crear temperaturas
        ArrayList<Integer> temp = new ArrayList<>(); // [1, 1, 3, 1, 1, 0]
        temp.add(23);
        temp.add(25);
        temp.add(36);
        temp.add(21);
        temp.add(29);
        temp.add(37);
        // <--- Valor extra para recorrer

        Stack<String> stac = new Stack<>();

        ArrayList<Integer> resul = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            resul.add(0);
        }
        String indxv = temp.size() - 1 + "," + temp.get(temp.size() - 1);
        stac.push(indxv);

        for (int i = temp.size() - 2; i >= 0; i--) {
            int index = Integer.parseInt(stac.peek().split(",")[0]);
            int valor = Integer.parseInt(stac.peek().split(",")[1]);
            if (valor > temp.get(i)) {
                resul.set(i, index - i);
                stac.push(i + "," + temp.get(i));
            } else {
                do {
                    stac.pop();
                } while (temp.get(i) > Integer.parseInt(stac.peek().split(",")[1]) && !stac.isEmpty());
                resul.set(i, Integer.parseInt(stac.peek().split(",")[0]) - i);
                stac.push(i + "," + temp.get(i));
            }
        }
        System.out.println(resul.toString());
    }

    public void seconTry() {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(23);
        temp.add(25);
        temp.add(36);
        temp.add(21);
        temp.add(29);
        temp.add(37);

        // Crear stack de tempreaturas altas
        Stack<Integer> stac = new Stack<>();
        // Crear resultado
        ArrayList<Integer> resul = new ArrayList<>();
        for (int i = 0; i < temp.size() - 1; i++) {
            resul.add(0);
        }
        // Para n-1 agregar al stack
        stac.push(temp.get(temp.size() - 1));
        // Recorrer el arreglo del final al inicio
        for (int i = temp.size() - 2; i >= 0; i--) {
            if (stac.peek() > temp.get(i)) {
                resul.set(i, stac.indexOf(stac.peek()) - i);
                stac.push(temp.get(i));

            } else {
                do {
                    stac.pop();
                } while (temp.get(i) > stac.peek());
            }
        }
    }

    public void thirdTry() {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(23);
        temp.add(25);
        temp.add(36);
        temp.add(21);
        temp.add(29);
        temp.add(37);
        // <--- Valor extra para recorrer

        Stack<String> stac = new Stack<>();

        ArrayList<Integer> resul = new ArrayList<>();
        for (int i = 0; i < temp.size() - 1; i++) {
            resul.add(0);
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            // Elimina del stack los días que no son más calientes
            while (!stac.isEmpty()) {
                String top = stac.peek();
                int indexTop = Integer.parseInt(top.split(",")[0]);
                int valorTop = Integer.parseInt(top.split(",")[1]);

                if (valorTop <= temp.get(i)) {
                    stac.pop();
                } else {
                    break;
                }
            }

            // Si hay un día más caliente en el futuro
            if (!stac.isEmpty()) {
                int indexTop = Integer.parseInt(stac.peek().split(",")[0]);
                resul.set(i, indexTop - i); // Diferencia de días
            }

            // Guarda el día actual en el stack
            String dato = i + "," + temp.get(i);
            stac.push(dato);
        }

    }
}
