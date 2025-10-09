package unidad1.proglineal;

public class NumeroOptTest {
    public static void main(String[] args) {
        double [] array = {1, 2, 4, 5, 6};
        NumeroOpt tes = new NumeroOpt(array);
        System.out.println("Arreglo 1");
        System.out.println(tes.resolver());
        tes.print();
        
        double [] array2 = {-1, -2, 2, -6, -1};
        System.out.println("Arreglo 2");
        NumeroOpt tes2 = new NumeroOpt(array2);
        System.out.println(tes2.resolver());
        System.out.println("Arreglo");
        tes2.print();
    }
}
