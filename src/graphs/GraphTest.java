package graphs;

import java.util.LinkedList;

public class GraphTest {

	public static void main(String[] args) {
		Graph g = new Graph();
		
		System.out.println("BFSing...");
		try {
			g.breadthFirstSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Inserting...");
		
		GraphNode n1 = new GraphNode(1);
		g.root = n1;
		n1.edges = new LinkedList<GraphNode>();
		
		GraphNode n2 = new GraphNode(2);
		g.root.edges.add(n2);
		
		GraphNode n3 = new GraphNode(3);
		g.root.edges.add(n3);
		
		n2.edges = new LinkedList<GraphNode>();
		GraphNode n4 = new GraphNode(4);
		n2.edges.add(n4);
		
		n4.edges = new LinkedList<GraphNode>();
		n4.edges.add(n3);
		n4.edges.add(new GraphNode(5));
		n4.edges.add(new GraphNode(6));
		
		//System.out.println("BFSing...");
		System.out.println("DFSing...");
		try {
			//g.breadthFirstSearch();
			g.depthFirstSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
