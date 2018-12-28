import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// remplir l'arbre 
		Node racine = new Node(new Data(0,0,0,0)) ; 
		List<Node> children = new ArrayList<Node>();
		children.add(new Node(new Data(1,0,0,1))) ; 
		children.add(new Node(new Data(0,1,0,1))) ; 
		children.add(new Node(new Data(0,0,1,1))) ; 
		racine.addChildren(children);
		for (Iterator<Node> it= racine.getChildren().iterator(); it.hasNext();) {
		      System.out.println(it.next().getData().toString());
		}
	}

}
