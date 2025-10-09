
package unidad1.proglineal;

public class GaussRTest {
    public static void main(String[] args) {
        int R = 3;
        int C = 1;
        
        double[][] PL = {
            {1, -60, -30, -20, 0, 0, 0, 0, 0},
            {0, 6, 1, 1, 1, 0, 0, 0, 48},
            {0, 4, 2, 1, 0, 1, 0, 0, 20},
            {0, 2, 1, 0, 0, 0, 1, 0, 8},
            {0, 1, 0, 0, 0, 0, 0, 1, 5}
        };
        GaussR mr = new GaussR(R, C, PL);
        
        mr.pivote();
        
        mr.print();
                
        
        
    }
}
