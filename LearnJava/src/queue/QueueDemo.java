package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Demonstrating the use of Queue in Java using PriorityQueue
        // PriorityQueue is a class that implements the Queue interface
        // It is used to hold elements in a priority order, where the head of the queue
        // is the least element according to the natural ordering or a specified comparator.
        // The elements in a PriorityQueue are ordered according to their natural ordering,
        // or by a Comparator provided at queue construction time.

        // Note: The PriorityQueue does not allow null elements.
        // The head of the queue is the least element with respect to the specified ordering.
        
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("England");
		queue.add("America");
		
		System.out.println("Original Queue: " + queue);
		
		queue.remove();
		System.out.println("Queue after removing the head element: " + queue);
		
		String head = queue.peek();
		System.out.println("Head of the Queue: " + head);
		
		head = queue.poll();
		System.out.println("Removed head: " + head);
		
		System.out.println("Queue now looks like this: " + queue);
	}
}