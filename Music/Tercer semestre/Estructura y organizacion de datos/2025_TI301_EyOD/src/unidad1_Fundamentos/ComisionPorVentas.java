
package unidad1_Fundamentos;

import java.util.Scanner;

public class ComisionPorVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rangos = new int[9]; 
        System.out.print("¿Cuántos vendedores? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ventas del vendedor " + (i + 1) + ": ");
            double ventas = sc.nextDouble();
            int salario = (int)(200 + ventas * 0.09);

            if (salario >= 1000) rangos[8]++;
            else if (salario >= 900) 
                rangos[7]++;
            else if (salario >= 800) 
                rangos[6]++;
            else if (salario >= 700) 
                rangos[5]++;
            else if (salario >= 600) 
                rangos[4]++;
            else if (salario >= 500) 
                rangos[3]++;
            else if (salario >= 400) 
                rangos[2]++;
            else if (salario >= 300) 
                rangos[1]++;
            else if (salario >= 200) 
                rangos[0]++;
        }

        System.out.println("\nRango de salario\tCantidad");
        System.out.println("$200-299\t\t" + rangos[0]);
        System.out.println("$300-399\t\t" + rangos[1]);
        System.out.println("$400-499\t\t" + rangos[2]);
        System.out.println("$500-599\t\t" + rangos[3]);
        System.out.println("$600-699\t\t" + rangos[4]);
        System.out.println("$700-799\t\t" + rangos[5]);
        System.out.println("$800-899\t\t" + rangos[6]);
        System.out.println("$900-999\t\t" + rangos[7]);
        System.out.println("$1000 o más\t\t" + rangos[8]);
        
    }
}
