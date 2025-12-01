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

public interface BookInterface {
    
    void Prestar ();
    void Devolver();
    boolean sePuedePrestar ();
    
    String getTitulo();
    int getCantidad();
    String getAutor();
    void setAgregar(int cantidad);
}
    