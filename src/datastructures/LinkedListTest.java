package datastructures;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		System.out.println("Printing list...");
		if(list.head==null)
			System.out.println("List is empty.");
		
		System.out.println("Inserting data...");
		list.insert(1);
		list.insert(2);
		Node n = list.head;
		System.out.println("Printing list...");
		while(n!=null){
			System.out.print(n.getData()+" ");
			n = n.getNext();
		}
		System.out.println("\nDeleting data...");

		try {
			list.delete(1);
			list.delete(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing list...");
		n = list.head;
		while(n!=null){
			System.out.print(n.getData()+" ");
			n = n.getNext();
		}
	}

}
