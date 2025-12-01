 /*
*Itess-Tics 2025 Estructura y organizacion de datos
*Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripcion: UNidad 0 repaso de las interfaces
*Programador: Inge-far DLP
*Email: leyvadiego016@gmail.com
*Fecha: 23/Septiembre/2025
*
*
*/


package Unidad0_POO;

import Unidad0_POO.BookInterface;

public class BookLibraryITESS implements BookInterface {
    
    private String Titulo;
    private String Autor;
    private int Cantidad;

    public BookLibraryITESS(String Titulo, String Autor, int Cantidad) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Cantidad = Cantidad;
    }

    @Override
    public void Prestar() {
        if (sePuedePrestar())
                Cantidad--;
    }

    @Override
    public void Devolver() {
        Cantidad++;
    }

    @Override
    public boolean sePuedePrestar() {
        if (Cantidad > 0)
            return true;
        
        return false;
    }

    @Override
    public String getTitulo() {
        
        return Titulo;
        
    }

    @Override
    public int getCantidad() {
    return Cantidad;
    }

    @Override
    public String getAutor() {
    return Autor;
    }

    @Override
    public void setAgregar(int cantidad) {
        if (cantidad > 0)
            this.Cantidad += cantidad;
    }

    @Override
    public String toString() {
        return "BookLibraryITESS{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Cantidad=" + Cantidad + '}';
    }
    
}
