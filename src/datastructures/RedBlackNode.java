package datastructures;

public class RedBlackNode {
	boolean black; // 0 for red, 1 for black.
	RedBlackNode left;
	RedBlackNode right;
	RedBlackNode parent;
	int data;
	
	RedBlackNode(int data){
		this.data = data;
		this.black = false;
	}
}
