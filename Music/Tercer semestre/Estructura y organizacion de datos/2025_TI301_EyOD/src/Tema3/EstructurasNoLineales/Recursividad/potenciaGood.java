
package Tema3.EstructurasNoLineales.Recursividad;

public class potenciaGood {
    
    public static void main(String[] args) {

        long time = System.nanoTime();
        System.out.println(powerG(5, 10000));
        long timeFinal = System.nanoTime();
        long timereal = timeFinal - time;
        System.out.println("Tiempo transcurrido: " + timereal);

    }

    public static double powerG(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            double partial = powerG(x, n / 2);
            double result = partial * partial;
            if (n % 2 == 1) {
                result *= x;
            }
            return result;
        }
    }
}
