
package Tema3.EstructurasNoLineales.Trees;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private Node parent;
    private List<Node> childs;

    
    public Node(int value) {
            this.value = value;
            this.childs = new ArrayList<>();
    }
    public Node(int value, Node parent, List<Node> childs) {
        this.value = value;
        this.parent = parent;
        this.childs = childs;
    }

    public Node(int value, List<Node> childs) {
        this.value = value;
        this.childs = childs;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public void addChild(Node child) {
        childs.add(child);
    }

    public int getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public List<Node> getChilds() {
        return childs;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", parent=" + parent + ", childs=" + childs + '}';
    }
   
    
}
