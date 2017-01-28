package datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * The stack can be implemented using an array.
 * @author carlospinto
 *
 */
public class Stack {
	int top;
	List<Integer> stack;
	Stack(){
		stack = new ArrayList<Integer>();
		top=-1;
	}
	public boolean empty(Stack s){
		if(top==0)
			return true;
		else
			return false;
	}
	
	//FIXME it should return objects, not only strings.
	public void push(Stack s, int x){
		stack.add(x);
		s.top++;
	}
	
	public int pop() throws Exception{
		if(top<0){
			throw new Exception("no more data");	
		} else{
			int x = stack.get(top);
			top--;
			return x;
		}
	}

}
