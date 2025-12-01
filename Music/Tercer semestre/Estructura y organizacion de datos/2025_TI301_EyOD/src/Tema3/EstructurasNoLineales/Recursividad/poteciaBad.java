package Tema3.EstructurasNoLineales.Recursividad;

public class poteciaBad {

    public static void main(String[] args) {

        long time = System.nanoTime();
        System.out.println(powerB(5, 50));
        long timeFinal = System.nanoTime();
        long timereal = timeFinal - time;
        System.out.println("Tiempo transcurrido: " + timereal);

    }

    public static double powerB(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * powerB(x, n - 1);
        }
    }
}
