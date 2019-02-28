package com.bridgeit.datastructure;

public interface Queue<T>
{
	public void enQueue(T ele);
	public T deQueue();
	public boolean isEmpty();
	public int size();
}
