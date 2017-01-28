package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	List<Integer> queue;
	int tail;
	int head;
	
	Queue(){
		this.queue = new ArrayList<Integer>();
		tail=0;
		head=0;
	}
	
	public void enqueue (Queue q, int x){
		q.queue.add(q.tail, x);
		if(q.tail == q.queue.size())
			q.tail=0;
		else
			q.tail++;
	}
	
	public int dequeue(Queue q) throws Exception{
		if(q.queue.isEmpty())
			throw new Exception();
		int x = q.queue.get(q.head);
		if(q.head==q.queue.size())
			q.head=9;
		else
			q.head++;
		return x;
	}
}
