package com.datastructure;

public class Stack<T> 
{
	int top;
	int maxSize;
	T[] stack;
	int size;
	public Stack()
	{
		top=-1;//Initializing top to -1 
		size=0;
		maxSize=1000;//Max capacity of stack
		stack=(T[]) new Object[maxSize];
	}
	//Adding elements to stack
	public void push(T ele)
	{
		stack[++top]=ele;//adding element by incrementing top
		size++;
	}
	//Deleting elements from stack
	public T pop()
	{
		T temp=stack[top--];//deleting element by decreasing top
		size--;
		return temp;//returning deleted element
	}
	public boolean isEmpty()
	{
		if(top==-1)//Check stack is empty
			return true;
		else
			return false;
	}
	public int size()
	{
		return size;//returning size of stack
	}
	public boolean isFull()
	{
		return (top==maxSize-1);//return true if stack is full
	}
	public int maxSize()
	{
		return maxSize;//returning maximum size stack
	}
	public T peek()
	{
		return stack[maxSize-1];//return top most element of stack
	}
}
