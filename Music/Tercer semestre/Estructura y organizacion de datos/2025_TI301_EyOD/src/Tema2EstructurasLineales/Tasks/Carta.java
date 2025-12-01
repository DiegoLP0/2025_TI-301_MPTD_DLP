package Tema2EstructurasLineales.Tasks;

public class Carta {
    public static enum Cara {As, Dos, Tres, Cuatro, Cinco, Seis, 
        Siete, Ocho, Nueve, Diez, Joker, Reina, Rey };
    public static enum Palo {Bastos, Diamantes, Corazones, Espadas};

    private final Cara cara;
    private final Palo palo;

    // constructor
    public Carta(Cara cara, Palo palo)
    {
        this.cara = cara;
        this.palo = palo;
    } // fin de constructor

    // devuelve la cara de la carta
    public Cara obtenerCara()
    {
        return cara;
    } // fin de obtenerCara

    // devuelve el palo de la Carta
    public Palo obtenerPalo()
    {
        return palo;
    } // fin de obtenerPalo

    // devuelve la representación String de la Carta
    public String toString()
    {
        return String.format("%s of %s", cara, palo);
    } // fin de toString
} // fin de la clase Carta
