package unidad1.proglineal;

public class DivisionCrazy {
    private Double [] columna1;
    private Double [] columna2;
    private double [] div;

    public DivisionCrazy(Double[] columna1, Double[] columna2,double [] div) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        this.div = div;
    }
    
    public int resolver (){
        //Recorre los arreglos haciendo una division y lo guarda en una arreglo aparte
        for (int i = 1; i < columna1.length; i++) {
            if (columna1[i] <= 0) {
                div[i] = -1;
            } else {
                div[i] = columna2[i] / columna1[i];
            }
        }
        
        //Busca el numero mas pequenio que sea positivo
        double min = Double.POSITIVE_INFINITY;
        int indx = -1;
        for (int j = 1; j < div.length; j++){
            if (div[j] > 0 && div[j] < min){
                min = div[j];
            indx = j;
            }
        }
        return indx;
        
    }
}
