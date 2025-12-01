package Tema2EstructurasLineales.Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoDeCartas {
    private List<Carta> lista; // declara objeto List que almacenará los objetos Carta

    // establece mazo de objetos Carta y baraja
    public MazoDeCartas()
    {
        Carta[] mazo = new Carta[52];
        int cuenta = 0; // número de cartas

        // llena el mazo con objetos Carta
        for (Carta.Palo palo: Carta.Palo.values())
        {
            for (Carta.Cara cara: Carta.Cara.values())
            {
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            } // fin de for interno
        } // fin de for externo

        lista = Arrays.asList(mazo); // obtiene objeto List
        Collections.shuffle(lista); // baraja el mazo
    } // fin del constructor de MazoDeCartas

    // imprime el mazo
    public void imprimirCartas()
    {
        // muestra las 52 cartas en dos columnas
        for (int i = 0; i < lista.size(); i++)
        {
            System.out.printf("%-19s%s", lista.get(i), 
                ((i + 1) % 4 == 0) ? "%n" : "");
        } // fin de for
    } // fin de imprimirCartas

    public static void main(String[] args)
    {
        System.out.println("Leyva Paniagua Diego");
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
    } // fin de main
}
