package unidad1.proglineal;

public class DivisionCrazyTest {

    public static void main(String[] args) {
        Double[] col1 = {1.0, 2.0, 0.0, 1.0, -3.0};
        Double[] col2 = {1.0, 0.0, -6.0, 8.0, -4.0};
        double[] div = new double[col1.length];

        DivisionCrazy divi = new DivisionCrazy(col1, col2, div);

        int indx = divi.resolver();

        System.out.println("Resultado obtenido: "); 
        System.out.println(indx);
    }
}
