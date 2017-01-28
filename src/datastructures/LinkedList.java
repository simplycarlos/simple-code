package datastructures;

public class LinkedList {

	Node head;
	//TODO figure how to use tail when inserting.

	LinkedList(){
		head = null;
	}
	
	public void insert(int data){
		Node n = new Node(data);
		
		if(head==null)
			head = n;
		else if(head.getNext()==null){
			head.setNext(n);
		} else {
			Node t = head.getNext();
			while(t.getNext()!=null){
					t = t.getNext();
			}
			t.setNext(n);
		}
	}
	
	public void delete(int data) throws Exception{
		Node n = search(data);
		//set previous' node to n node's next
		if(n==head)
			head=n.getNext();
		else if(n.getNext()!=null){
			Node next = n.getNext();
			Node prev = head;
			while(prev.getNext()!=n){
				prev = prev.getNext();
			}
			prev.setNext(next);
		}
		
		n.setNext(null);
		n=null;
	}
	
	public Node search(int data) throws Exception{
		Node n = head;
		if(n.getData()==data)
			return n;
		while(n.getNext()!=null){
			if(data == n.getData())
				return n;
			n = n.getNext();
		}
		return null;
	}
}
