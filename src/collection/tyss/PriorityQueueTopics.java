package collection.tyss;

import java.util.PriorityQueue;

public class PriorityQueueTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q= new PriorityQueue<Integer>();
		q.add(20);
		q.add(40);
		q.add(7);
		q.add(5);
		q.add(80);
		System.out.println("==========================================");
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		

	}

}
