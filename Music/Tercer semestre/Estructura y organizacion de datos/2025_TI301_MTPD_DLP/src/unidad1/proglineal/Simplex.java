package unidad1.proglineal;

import java.text.DecimalFormat;

public class Simplex {
    private double [][]pl;

    public Simplex(double[][] pl) {
        this.pl = pl;
    }
    
    public void resolver() {
        while (true) {
            //Buscar el numero optimo o el indice para sacar la 
            double[] Renglon1 = pl[0];
            NumeroOpt buscaColumna = new NumeroOpt(Renglon1);
            int columnaPivote = buscaColumna.resolver();

            if (columnaPivote == -1) {
                System.out.println("La solución optima  se encontro");
                break; 
            }

            //Buscar columnas que se usan en division Crazy
            Double[] colPivote = new Double[pl.length];
            Double[] colSolucion = new Double[pl.length];
            for(int i = 0; i < pl.length; i++) {
                colPivote[i] = pl[i][columnaPivote];
                colSolucion[i] = pl[i][pl[i].length - 1];
            }

            // Aplicar la division crazy para buscar el renglon pivote
            DivisionCrazy buscarRenglon = new DivisionCrazy(colPivote, colSolucion, new double[pl.length]);
            int renglonPivote = buscarRenglon.resolver();
            
            //Aplicar GaussR
            GaussR pivotear = new GaussR(renglonPivote, columnaPivote, this.pl);
            pivotear.pivote();
            System.out.println("--- Matriz después de la iteración ---");
            System.out.println(this.print());
            System.out.println();
        }
    }

    public String print() {
        DecimalFormat dc = new DecimalFormat("0.0000");
        String matriz = "";
        for (int i = 0; i < pl.length; i++) {
            for (int j = 0; j < pl[i].length; j++) {
                matriz += (dc.format(pl[i][j]) + " \t");
            }
            matriz += "\n";
        }
        return matriz;
    }
    
}
