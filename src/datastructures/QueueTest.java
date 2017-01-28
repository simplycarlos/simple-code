package datastructures;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		try {
			System.out.println("Dequeueing: "+q.dequeue(q));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enqueueing");
		q.enqueue(q, 2);
		try {
			System.out.println("Dequeueing: "+q.dequeue(q));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
