package com.DataStructure;

public interface Queue<T>
{
	public boolean enQueue(T ele);
	public T deQueue();
	public boolean isEmpty();
	public int size();
}
