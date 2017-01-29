package datastructures;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println("Inserting data...");
		tree.insert(1);
		System.out.println("Searching data...");
		BinaryNode n = tree.searchTree(tree.root, 1);
		System.out.println(n.data+" data found.");
		
		System.out.println("Inserting data...");
		tree.insert(2);
		tree.insert(4);
		tree.insert(3);
		tree.insert(5);
		System.out.println("Level order traversal...");
		tree.levelOrderTraversal(tree.root);
	}

}
