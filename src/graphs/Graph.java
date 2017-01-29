package graphs;

import java.util.LinkedList;

public class Graph {
	Graph g;
	GraphNode root;
	
	public void breadthFirstSearch() throws Exception{
		if(root==null)
			throw new Exception("Empty graph...");
		else {
			GraphNode t = root;
			LinkedList<GraphNode> q = new LinkedList<GraphNode>();
			q.add(t);

			while(!q.isEmpty()){
				GraphNode n = q.poll();
				if(!n.visited){
					if(n.edges!=null){
						for(GraphNode gn:n.edges){
							q.add(gn);
						}
					}
					n.visited = true;
					System.out.print(n.data+ " ");
				}
			}
		}
		System.out.print("\n");
	}
	
	/**
	 * Searches through the root and any adjacent edges. After depletion of edges it goes back to the next node having an edge and so on.
	 * @throws Exception 
	 */
	public void depthFirstSearch() throws Exception{
		if(root == null){
			throw new Exception("Empty graph...");
		} else {
			GraphNode t = root;
			LinkedList<GraphNode> q = new LinkedList<GraphNode>();
			q.add(t);
			
			while(!q.isEmpty()){
				GraphNode n = q.pop();
				if(!n.visited){
					if(n.edges!=null){
						for(GraphNode gn:n.edges){
							q.push(gn);
						}
					}
					n.visited = true;
					System.out.print(n.data+ " ");
				}
			}
		}
		System.out.print("\n");
	}
}
