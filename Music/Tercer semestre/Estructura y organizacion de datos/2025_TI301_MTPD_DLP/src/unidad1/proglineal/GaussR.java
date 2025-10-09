package unidad1.proglineal;

import java.text.DecimalFormat;

public class GaussR {
    private int R;
    private int C;
    private double [][] PL;

    public GaussR(int R, int C, double[][] PL) {
        this.R = R;
        this.C = C;
        this.PL = PL;
    }
    
    public void pivote(){
        //Declaras fila y columna pivote para hacer las operaciones
        double pivote = PL[R][C];
        for (int j = 0; j < PL[R].length; j++) {
            PL[R][j]/= pivote;
            
        }
        int numFilas = PL.length;
        // Hace las opreaciones de renglones
        for (int i = 0; i < numFilas; i++) {
            // Se asegura de que la operacion no se haga con el renglo pivote
            if (i != R) { 
                double factor = PL[i][C];
                for (int j = 0; j < PL[R].length; j++) {
                    PL[i][j] -= factor * PL[R][j];
                }
            }
        }

    }
    
    public void print (){
        DecimalFormat dc = new DecimalFormat();
        for (int i = 0; i< PL.length; i++){
            for(int j = 0; j< PL[i].length;j++){
                System.out.print(dc.format(PL[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
