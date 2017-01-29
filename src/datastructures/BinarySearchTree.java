package datastructures;

public class BinarySearchTree {
	
	BinaryNode root;
	
	public void insert(int data){
		BinaryNode node = new BinaryNode(data);
		if(root == null){
			root = node;
		} else {
			insertNode(root, node);
		}
	}
	
	private void insertNode(BinaryNode parent, BinaryNode node){
		if(parent != null){
			if(node.data < parent.data || node.data == parent.data){ // TODO there should be a tree balancing algorithm here.
				if(parent.left != null){
					insertNode(parent.left,node);
				} else{
					parent.left = node;
				}
			} else{
				if(parent.right != null){
					insertNode(parent.right,node);
				} else{
					parent.right = node;
				}
			}
		}	
	}
	
	public void delete(BinaryNode node){
		
	}
	
	public BinaryNode searchTree(BinaryNode parent, int data){
		if(parent == null)
			return null;
		else if (data == parent.data){
			return parent;
		} else if(data < parent.data){
			searchTree(parent.left, data);
		} else {
			searchTree(parent.right,data);
		}
		return null;
	}
	
	public void transplant(BinaryNode current, BinaryNode future){
		
	}
	
	/**
	 * In order traversal traverses the tree as Left, Root, Right. 
	 * @param parent
	 */
	public void inOrderTraversal(BinaryNode parent){
		
	}
	
	/**
	 * Post order traversal traverses the tree as Left, Right, Root. 
	 * @param parent
	 */
	public void postOrderTraversal(BinaryNode parent){
		
	}
	
	/**
	 * Pre order traversal traverses the tree as Root, Left, Right.
	 * @param parent
	 */
	public void preOrderTraversal(BinaryNode parent){
		
	}
	
	/**
	 * Level order traversal traverses the tree through levels.
	 * This type of traversal uses a queue.
	 * It prints the nodes in order.
	 * @param parent
	 */
	public void levelOrderTraversal(BinaryNode parent){
		java.util.LinkedList<BinaryNode> queue = new java.util.LinkedList<BinaryNode>();
		queue.add(parent);
		
		while(!queue.isEmpty()){
			BinaryNode n = queue.poll();
			System.out.print(n.data+ " ");
			
			if(n.left!=null)
				queue.add(n.left);
			if(n.right!=null)
				queue.add(n.right);
		}
		
	}
	
	public void treeInsert(BinarySearchTree tree){
		
	}
}
