package Tema3.EstructurasNoLineales.Recursividad;

public class SumaRecursiva {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = { 6, 7, 8, 9, 10};
        int[] array3 = {425, 386};

        System.out.println(linearSuma(array, 10));
        System.out.println(linearSuma(array2, 5));
        System.out.println(linearSuma(array3, 2));

    }

    public static int linearSuma(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return linearSuma(data, n - 1) + data[n - 1];
        }
    }
}
