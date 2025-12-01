
package Tema3.EstructurasNoLineales;

public class GraphAdyasenciTest {
    public static void main(String[] args) {
            GraphAdyasenci tree = new GraphAdyasenci (7);
            tree.addEdge(0, 1);
            tree.addEdge(0, 2);
            tree.addEdge(1, 3);
            tree.addEdge(1, 4);
            tree.addEdge(2, 5);
            tree.addEdge(2, 6);

            tree.print();
            System.out.println(tree.depth(0));
    }
    
}
