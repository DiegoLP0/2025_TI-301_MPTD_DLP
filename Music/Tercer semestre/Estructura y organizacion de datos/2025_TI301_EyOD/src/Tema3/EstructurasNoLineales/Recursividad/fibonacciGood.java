package Tema3.EstructurasNoLineales.Recursividad;

import java.util.Arrays;

public class fibonacciGood {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciGood(3)));
        System.out.println(Arrays.toString(fibonacciGood(5)));
        System.out.println(Arrays.toString(fibonacciGood(7)));

    }

    public static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;

        } else {
            long[] temp = fibonacciGood(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }
    }
}
