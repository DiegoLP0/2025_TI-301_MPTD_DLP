package Tema2EstructurasLineales.Tasks;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {
    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        Stack<Number> pila = new Stack<>(); // crea un objeto Stack

        // usa el método push
        pila.push(12L); // mete el valor long 12L
        System.out.println("Se metio 12L");
        imprimirPila(pila);

        pila.push(34567); // mete el valor int 34567
        System.out.println("Se metio 34567");
        imprimirPila(pila);

        pila.push(1.0F); // mete el valor float 1.0F
        System.out.println("Se metio 1.0F");
        imprimirPila(pila);

        pila.push(1234.5678); // mete el valor double 1234.5678
        System.out.println("Se metio 1234.5678 ");
        imprimirPila(pila);

        // elimina los elementos de la pila
        try
        {
            Number objetoEliminado = null;
            
            // saca elementos de la pila
            while (true)
            {
                objetoEliminado = pila.pop(); // usa el método pop
                System.out.printf("Se saco %s%n", objetoEliminado);
                imprimirPila(pila);
            }
        }
        catch (EmptyStackException emptyStackException)
        {
            emptyStackException.printStackTrace();
        }
    } // fin de main

    // muestra el contenido de Pila
    private static void imprimirPila(Stack<Number> pila)
    {
        if (pila.isEmpty())
        {
            System.out.printf("La pila esta vacia%n%n"); // la pila está vacía
        }
        else // la pila no está vacía
        {
            System.out.printf("La pila contiene: %s (cima)%n%n", pila);
        }
    } // fin de imprimirPila
}
