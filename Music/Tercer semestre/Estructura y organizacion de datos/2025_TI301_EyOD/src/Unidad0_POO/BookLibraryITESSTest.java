 /*
*Itess-Tics 2025 Estructura y organizacion de datos
*Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripcion: Testear laa clase de bibliotecas del mini proyecto
*Programador: Inge-far DLP
*Email: leyvadiego016@gmail.com
*Fecha: 1/Octubre/2025
*
*
*/

package Unidad0_POO;

public class BookLibraryITESSTest {
    public static void main(String[] args) {
     // Probar el constructor
    BookLibraryITESS aBook = new BookLibraryITESS("Java", "Deithel", 4);
    System.out.print(aBook.toString());
    // Probar Getters
        System.out.println("getTitle(): " + aBook.getTitulo());
        System.out.println("getTitle(): " + aBook.getAutor());
        System.out.println("getTitle(): " + aBook.getCantidad());
        
        // Probar isAvailable
        
        // Probar prestar 
        aBook.Prestar();
        System.out.println("Cantidad: " + aBook.getCantidad());
        
        // Probar devolber
        aBook.Devolver();
        System.out.println("Cantidad: " + aBook.getCantidad());
        
        // Test BookInterface
        BookInterface iBook = aBook;
        
        iBook.Prestar();
        
    }
}
