 package com.bridgeit.datastructure;

public class MyQueue<T> implements Queue <T>
{
	private Node<T> front=null;
	private Node<T> rear=null;
	int size=0;

	@Override
	public void enQueue(T ele) {
		if(rear==null)
		{
			Node<T> node=new Node<T>();
			node.setData(ele);
			front=rear=node;
		}
		rear.setNext(new Node<T>());
		rear=rear.getNext();
		rear.setData(ele);
		size++;
	}

	@Override
	public T deQueue() {
		if(front==null)
			return null;
		Node<T> temp=front;
		front=front.getNext();
		size--;
		return temp.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}
