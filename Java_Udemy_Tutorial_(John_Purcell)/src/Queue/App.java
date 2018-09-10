package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		// front of queue - head
		// end of queue - tail
		
		// FIFO
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(4);
		q1.add(24);
		
		try {
			q1.add(30);
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("Too manys");
		}
		
		for (Integer value: q1) {
			System.out.println("Queue value: " + value);
		}
		
		// removes head of queue and returns it
		Integer value = q1.remove();
		System.out.println("Removed from queue: " + value);
		
		System.out.println("Head of queue is: " + q1.element());
		
		
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		q2.offer(100);
		q2.offer(43);
		q2.offer(33);
		
		for (Integer value2: q2) {
			System.out.println("Queue value: " + value2);
		}
		
		q2.poll();
		System.out.println(q2.peek());
		

		
	}

}
