package graphs;

import java.util.LinkedList;

public class GraphNode {
	boolean visited;
	int data;
	LinkedList<GraphNode> edges;
	
	GraphNode(int data){
		this.visited = false;
		this.data = data;
	}
}
