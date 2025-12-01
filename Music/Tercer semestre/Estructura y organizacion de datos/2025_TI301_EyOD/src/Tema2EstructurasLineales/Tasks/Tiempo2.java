package Tema2EstructurasLineales.Tasks;

public class Tiempo2 {
    private int hora;   // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // Constructor que inicializa los valores
    public Tiempo2(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Métodos Get (Obtener) requeridos por ComparadorTiempo
    public int obtenerHora() {
        return hora;
    }
    
    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    // Método toString() para la impresión legible (requerido en la línea 20 y 26 de Ordenamiento3)
    // El formato será (HH:MM:SS)
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
