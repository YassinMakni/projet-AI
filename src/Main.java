import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// remplir racine
		Node racine = new Node(new Data(0,0,0,0)) ; 
		List<Node> children = new ArrayList<Node>();
		// niveau 1 
		children.add(new Node(new Data(1,0,0,1))) ; 
		children.add(new Node(new Data(0,1,0,1))) ; 
		children.add(new Node(new Data(0,0,1,1))) ; 
		racine.addChildren(children);
		children.clear();
		
		Iterator<Node> it= racine.getChildren().iterator();
		
		// niveau 2 
		children.add(new Node(new Data(1,0,0,0))) ; 
		it.next().addChildren(children);
		children.clear();  
		
		//niveau 3 
		it = racine.getChildren().iterator().next().getChildren().iterator() ; 
		children.add(new Node(new Data(1,1,0,1))) ; 
		children.add(new Node(new Data(1,0,1,1))) ; 
		it.next().addChildren(children);
		children.clear(); 
		
		//niveau 4 
		it = racine.getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator() ; 
		//niveau 3 1ere fils  
		children.add(new Node(new Data(1,1,0,0))) ; 
		children.add(new Node(new Data(0,1,0,0))) ; 
		it.next().addChildren(children);
		children.clear();
		
		//niveau 3 1ere fils  , niveau 4 , 1 ere fils  
		
		Iterator<Node> it3141 = racine.getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator();
		children.add(new Node(new Data(1,1,1,1))) ; 
		it3141.next().addChildren(children);
		children.clear();
		
		//niveau 3 1ere fils  , niveau 4 , 2 eme fils  
		children.add(new Node(new Data(0,1,1,1))) ; 
		it3141.next().addChildren(children);
		children.clear();
		
		//niveau 3 1ere fils  , niveau 4 , 2 eme fils  ,niveau 5 1 ere fils 
		it3141 = racine.getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator();
		it3141.next(); 
		it3141 = it3141.next().getChildren().iterator() ; 
		children.add(new Node(new Data(0,1,1,0))) ; 
		it3141.next().addChildren(children);
		children.clear();
		
		//niveau 3 1ere fils  , niveau 4 , 2 eme fils  ,niveau 5 1 ere fils , 6 eme niveau 1 ere fils 
		it3141 = racine.getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator();
		it3141.next(); 
		it3141 = it3141.next().getChildren().iterator().next().getChildren().iterator() ; 
		children.add(new Node(new Data(1,1,1,1))) ; 
		it3141.next().addChildren(children);
		children.clear();
		
		//niveau 3 , 2 eme fils 
		children.add(new Node(new Data(1,0,1,0))) ; 
		children.add(new Node(new Data(0,0,1,0))) ; 
		it.next().addChildren(children);
		children.clear();
        
		//niveau 3 , 2 eme fils , niveau 4 1ere fils , niveau 5 1 ere fils 
		it = racine.getChildren().iterator().next().getChildren().iterator().next().getChildren().iterator() ; 
		it.next() ; 
		it = it.next().getChildren().iterator() ; 
		children.add(new Node(new Data(1,1,1,1))) ; 
		it.next().addChildren(children);
		children.clear();
		
		
		breadth_search_first(racine) ; 
	}
	public static   void breadth_search_first( Node racine) {
		
		
		  List<Node> node_visite = new ArrayList<Node>();
		  Queue<Node> q = new LinkedList<>(); 
		  q.add(racine);
		  node_visite.add(racine);
		 while (q.size() !=0) {
			 
			 Node t= q.remove();
			 System.out.println( t.getData().toString());
			 List<Node> children1 = t.getChildren();
			  for ( Node h : children1) 
			  {
				  
				  if   (isNotVisited( h, node_visite)) 
				  { 
					  q.add(h);
					  node_visite.add(h);
				  }
				  }
			  }
			 
	
		
	}
	   public static Boolean  isNotVisited (  Node h  ,List<Node>  b) 
	   {
		   
		   for (Node   t : b) {
			      if  ( t.equals(h))  return  false ;
			}
		return true;
	   }

}
