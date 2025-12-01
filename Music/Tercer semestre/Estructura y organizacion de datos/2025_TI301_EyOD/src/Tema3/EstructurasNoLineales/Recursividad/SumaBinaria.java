package Tema3.EstructurasNoLineales.Recursividad;

public class SumaBinaria {

    public static void main(String[] args) {
        int[] data = {3, 2, 1, 4};
        int[] data2 = {30, 20, 10, 40};
        int[] data3 = {300, 200, 100, 400};

        System.out.println(binarySum(data, 0, 4 - 1));
        System.out.println(binarySum(data2, 0, 4 - 1));
        System.out.println(binarySum(data3, 0, 4 - 1));

    }

    public static int binarySum(int[] data, int low, int high) {
        if (low > high) {
            return 0;
        } else if (low == high) {
            return data[low];
        } else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
        }
    }

}
