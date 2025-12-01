
package unidad1_Fundamentos;

import java.util.Scanner;

public class imprimirMatriz {

    public static void main(String[] args) {
        int [][]t = new int [2][3];
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                t[i][j] = 1;
            }
        }
        
        System.out.print("   0   1   2");
        for (int i = 0; i <= 1; i++) {
            System.out.println("");
            System.out.print(i + " ");
            for (int j = 0; j <= 2; j++) {
                System.out.print("["+t[i][j]+ "] ");
            }
        }

    }

}
