package datastructures;

public class RedBlackTree {
	RedBlackNode root;
	public void insert(int data){
		RedBlackNode n = new RedBlackNode(data);
		
		if(root==null){
			root = n;
		} else{
			insertRedBlackNode(root,n);
		}
	}
	
	public void insertRedBlackNode(RedBlackNode p, RedBlackNode n){
		 if(p.data < n.data || p.data == n.data){ // there is some red black property here...
			if(p.left==null){
				p.left = n;
				n.parent = p;
			} else {
				insertRedBlackNode(p.left,n);
			}
		 } else {
			 if(p.right==null){
				 p.right = n;
				 n.parent = p;
			 } else {
				 insertRedBlackNode(p.right,n);
			 }
		 }
		 fixRedBlackTree(n);
	}
	
	public void leftRotate(RedBlackNode n){
		RedBlackNode t = n.right;
		n.right = t.left;
		if(t!=null){
			if(t.left!=null){
				t.left.parent=n;
			}
			t.parent = n.parent;
			
			// Setting n's parent's left and right nodes.
			if(n.parent == null){
				root = t;
			} else if(n == n.parent.left){
				n.parent.left = t;
			} else{
				n.parent.right = t;
			}
			
			// Setting parent of t and n.
			t.left = n;
			n.parent = t;
		}
	}
	
	public void rightRotate(RedBlackNode n){
		
	}
	
	public void fixRedBlackTree(RedBlackNode n){
		while(!n.parent.black){
			if(n.parent == n.parent.parent.left){
				RedBlackNode y = n.parent.parent.right;
				
				if(!y.black){
					n.parent.black = true;
					y.black = true;
					n.parent.parent.black = false;
					n = n.parent.parent;
				} else if(n == n.parent.right){
					n = n.parent;
					leftRotate(n);
				}
				
				n.parent.black = true;
				n.parent.parent.black = false;
				rightRotate(n);
			} else{// Same as if but right and left are exchanged
				RedBlackNode y = n.parent.parent.right;
				
				if(!y.black){
					n.parent.black = true;
					y.black = true;
					n.parent.parent.black = false;
					n = n.parent.parent;
				} else if(n == n.parent.right){
					n = n.parent;
					rightRotate(n);
				}
				
				n.parent.black = true;
				n.parent.parent.black = false;
				leftRotate(n);
			}
		}
		root.black = true;
	}
	

}
