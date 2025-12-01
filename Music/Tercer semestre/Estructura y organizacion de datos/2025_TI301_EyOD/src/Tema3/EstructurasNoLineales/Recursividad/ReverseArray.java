package Tema3.EstructurasNoLineales.Recursividad;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {2, 5, 6, 9, 1, 4, 2, 6};

        reverseArray(array, 0, 4);
        reverseArray(array2, 0, 4);
        reverseArray(array3, 0, 7);

        System.out.println("1 Invertido: " + Arrays.toString(array));
        System.out.println("2 Invertido: " + Arrays.toString(array2));
        System.out.println("3 Invertido: " + Arrays.toString(array3));

    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;

            reverseArray(data, low + 1, high - 1);
        }
    }
}
