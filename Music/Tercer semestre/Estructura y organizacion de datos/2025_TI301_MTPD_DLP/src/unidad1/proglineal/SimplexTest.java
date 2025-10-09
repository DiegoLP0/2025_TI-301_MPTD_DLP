package unidad1.proglineal;

public class SimplexTest {
    public static void main(String[] args) {
         
         double[][] PL = {
             {1.0000, -60.0000, -30.0000, -20.0000, 0, 0, 0, 0, 0},
             {0, 8.0000, 6.0000, 1.0000, 1.0000, 0, 0, 0, 48.0000},
             {0, 4.0000, 2.0000, 1.5000, 0, 1.0000, 0, 0, 20.0000},
             {0, 2.0000, 1.5000, 0.5000, 0, 0, 1.0000, 0, 8.0000},
             {0, 0, 1.0000, 0, 0, 0, 0, 1.0000, 5.0000}
         };

         Simplex problema = new Simplex(PL);

         System.out.println("Matriz del Problema ");
         System.out.println(problema.print());
         problema.resolver();

         System.out.println("\nMatriz Final ");
         System.out.println(problema.print());
         
     }
}
