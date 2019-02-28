package com.bridgeit.datastructure;

public interface Stack<T> 
{
	public void push(T ele);
	public T pop();
	public boolean isEmpty();
	public int size();
	public boolean isFull();
	public T peek();
}
