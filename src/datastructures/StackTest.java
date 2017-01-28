package datastructures;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datastructures.Stack s = new Stack();
		
		try {
			System.out.println("Popping:" + s.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		System.out.println("Pushing");
		s.push(s,1);
		try {
			System.out.println("Popping:" + s.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
