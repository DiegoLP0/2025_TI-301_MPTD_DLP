package Tema3.EstructurasNoLineales.Trees;

public class height {
    
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
        
        nodo1.setParent(raiz);
        nodo2.setParent(raiz);
        nodo3.setParent(nodo1);
        nodo4.setParent(nodo1);
        nodo5.setParent(nodo2);
        
        height altura = new height();
        System.out.println("Altura del sub arbol desde raiz height: " + altura.height(raiz));
        height altura2 = new height();
        System.out.println("Altura maxima del arbol heightBad: " + altura2.heightBad(nodo2));
    }
    
    public int depth(Node p) {
        if (p.getParent() == null) {
            return 0;
        }
        
        return 1 + depth(p.getParent());
    }
    
    private int heightBad(Node c) {
        int h = 0;
        for (Node p : c.getChilds()) {
            
            if (p.getChilds().isEmpty()) {
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }
    
    private int height(Node p) {
        int h = 0;
        for (Node child : p.getChilds()) {
            h = Math.max(h, 1 + height(child));
        }
        return h;
    }
}
