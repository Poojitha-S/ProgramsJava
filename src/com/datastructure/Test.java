package com.datastructure;

public class Test {

	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> q=new QueueUsingLinkedList<Integer>();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.print();
		System.out.println(q.dequeue());
	}

}
