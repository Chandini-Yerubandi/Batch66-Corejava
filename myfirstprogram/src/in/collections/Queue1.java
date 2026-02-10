package in.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(30);
		q.add(20);
		q.add(40);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());

		

	}

}
