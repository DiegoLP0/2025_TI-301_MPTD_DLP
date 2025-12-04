
package Tema3.EstructurasNoLineales.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirst {
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
        
        breadthFirst(raiz);
    }
    
    public static void breadthFirst (Node raiz){
        Queue Q = new LinkedList();
        Q.offer(raiz);
        
        while (!Q.isEmpty()){
            
            Node p = (Node) Q.poll();
            System.out.println(p.getValue());
            
            for(int i = 0; i < p.getChilds().size(); i ++){
                Q.offer(p.getChilds().get(i));
            }
            
        }
    }
}
