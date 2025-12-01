package unidad1_Fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class EliminacionDuplicados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingresa el " + (i + 1) + " numero que este entre el 10 y el 100");
            int numero = leer.nextInt();

            if (numero >= 10 && numero <= 100) {
                int j;
                for (j = 0; j < i; j++) {
                    if (numero == numeros[j]) {
                        System.out.println("El número ya fue ingresado");
                        break;
                    }
                }

                if (j == i) {
                    numeros[i] = numero;
                    System.out.println(Arrays.toString(Arrays.copyOf(numeros, i + 1)));
                } else {
                    i--;
                }
            } else {
                System.out.println("El numero no esta dentro de los rangos establecidos");
                i--;
            }
        }

        leer.close();
    }
}
