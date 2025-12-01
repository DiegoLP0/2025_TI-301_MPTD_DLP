package Tema2EstructurasLineales.Tasks;

import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Tiempo2>
{
    @Override
    public int compare(Tiempo2 tiempo1, Tiempo2 tiempo2)
    {
        int diferenciaHora = tiempo1.obtenerHora() - tiempo2.obtenerHora();

        if (diferenciaHora != 0) // evalúa primero la hora
            return diferenciaHora;

        int diferenciaMinuto = tiempo1.obtenerMinuto() - tiempo2.obtenerMinuto();

        if (diferenciaMinuto != 0) // después evalúa el minuto
            return diferenciaMinuto;

        int diferenciaSegundo = tiempo1.obtenerSegundo() - tiempo2.obtenerSegundo();
        return diferenciaSegundo;
    }
} // fin de la clase ComparadorTiempo
