package unidad1.proglineal;

public class NumeroOpt {

    private double [] arreglo;

    public NumeroOpt(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public int resolver() {
        // Inicializar el valor minimo con el elemnto 0
        double min = arreglo[0];
        int idx = 0;
        // Recorrer el arreglo
        for (int i = 1; i < arreglo.length; i++) {
            // Comparar el valor mas pequenio e intercambiar
            if (arreglo[i] < min) {
                min = arreglo[i];
                idx = i;
            }
        }
        // Si el valor es negativo regresarlo
        if (min < 0) {
            return idx;
        }
        //Regresar menos 1
        return -1;
    }

    public void print() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }
        System.out.println("");
    }

}
