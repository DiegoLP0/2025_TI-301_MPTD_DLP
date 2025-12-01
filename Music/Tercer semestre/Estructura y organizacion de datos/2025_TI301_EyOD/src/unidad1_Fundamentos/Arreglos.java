package unidad1_Fundamentos;

import java.util.*;
import java.io.*;

public class Arreglos {
    //datos
    //constructores
    //metodos
     public static void main(String[] args) throws java.io.IOException{
        System.out.println(problemaJuan(args));
        
    }

    public static int problemaJuan(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        //System.out.println(num);
        int numJuanes = 0;
        for (int i = 0; i < num; i++) {
            String nombre = in.readLine();
            if (nombre.toLowerCase().compareTo("juan") == 0) {
                numJuanes++;
            }
        }
        return numJuanes;
    }

}
