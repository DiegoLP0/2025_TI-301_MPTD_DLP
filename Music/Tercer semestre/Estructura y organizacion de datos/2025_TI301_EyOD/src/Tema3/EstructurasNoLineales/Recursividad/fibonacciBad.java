package Tema3.EstructurasNoLineales.Recursividad;

public class fibonacciBad {

    public static void main(String[] args) {
        System.out.println(fibonacciBad(3));
        System.out.println(fibonacciBad(5));
        System.out.println(fibonacciBad(7));

    }

    public static long fibonacciBad(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciBad(n - 2) + fibonacciBad(n - 1);
        }
    }

}
