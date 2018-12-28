import java.util.ArrayList;
import java.util.List;

public class Node {

	private List<Node> children = new ArrayList<Node>();
    private Node parent = null;
    private Data data = null;

    public Node(Data data) {
        this.data = data;
    }

    public Node(Data data, Node parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }
    
    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public void addChild(Data data) {
        Node child = new Node(data);
        this.children.add(child);
    }
    
    public void addChildren(List<Node> children) {
        for(Node t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }
}
