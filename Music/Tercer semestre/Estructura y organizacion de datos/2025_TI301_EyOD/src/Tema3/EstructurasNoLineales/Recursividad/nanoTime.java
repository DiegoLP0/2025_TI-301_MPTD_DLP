
package Tema3.EstructurasNoLineales.Recursividad;

public class nanoTime {
    public static void main(String[] args) {
        System.out.println("Leyva Paniagua Diego");
        long time = System.nanoTime();
        
        for (int i = 0; i < 100000; i++){
            int resultado = 1+1;
        }
        
        long timeFinal = System.nanoTime();
        
        long timereal = timeFinal-time;
        
        System.out.println("El tiempo de ejecucion fue: " + timereal);
    }
}
