package Tema3.EstructurasNoLineales.Trees;

public class postorder {

    public static void main(String[] args) {
        Node raiz = new Node(0);
        Node nodo1 = new Node(1);
        Node nodo2 = new Node(2);
        Node nodo3 = new Node(3);
        Node nodo4 = new Node(4);
        Node nodo5 = new Node(5);

        raiz.addChild(nodo1);
        raiz.addChild(nodo2);
        nodo1.addChild(nodo3);
        nodo1.addChild(nodo4);
        nodo2.addChild(nodo5);

        postorder(raiz);
    }

    public static void postorder(Node p) {
        for (int i = 0; i < p.getChilds().size(); i++) {
            postorder(p.getChilds().get(i));
        }
                    System.out.println(p.getValue());

    }
}
