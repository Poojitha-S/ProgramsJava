package com.DataStructure;

public class Stack<T> 
{
	int top;
	int maxSize;
	T[] stack;
	int size;
	public Stack()
	{
		top=-1;
		size=0;
		maxSize=1000;
		stack=(T[]) new Object[maxSize];
	}
	public void push(T ele)
	{
		stack[++top]=ele;
		size++;
	}
	public T pop()
	{
		T temp=stack[top--];
		size--;
		return temp;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public int size()
	{
		return size;
	}
	public boolean isFull()
	{
		return (top==maxSize-1);
	}
	public int maxSize()
	{
		return maxSize;
	}
	public T peek()
	{
		return stack[maxSize-1];
	}
}
