package Tema3.EstructurasNoLineales.Trees;

public class inorder {

    public static void main(String[] args) {
        Node raiz = new Node(0);
        Node nodo1 = new Node(1);
        Node nodo2 = new Node(2);
        Node nodo3 = new Node(3);
        Node nodo4 = new Node(4);
        Node nodo5 = new Node(5);
        Node nodo6 = new Node(6);

        raiz.addChild(nodo1);
        raiz.addChild(nodo2);
        nodo1.addChild(nodo3);
        nodo1.addChild(nodo4);
        nodo2.addChild(nodo5);
        nodo2.addChild(nodo6);

        inorder(raiz);
    }

    public static void inorder(Node p) {
        if (p == null) 
            return;
        
        if (p.getChilds().isEmpty()) {
            System.out.println(p.getValue());
            return;
        }
        
        inorder(p.getChilds().get(0));
        
        System.out.println(p.getValue());
        
        inorder(p.getChilds().get(1));
    }
}
