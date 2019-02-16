package com.DataStructure;

import java.util.Arrays;

public class MyQueue<T> 
{
	int size;
	Object s[];		
	int front,rear = -1;
	MyQueue(int size)
	{
		this.size=size;
		s=new Object[size];
	}
	public MyQueue() {
		// TODO Auto-generated constructor stub
	}
	public boolean isempty()
	{
		if(rear==-1 && front==-1)
		{
			return true;			
		}	
		else 
			return false;	
	}
	public boolean enqueue(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		s[++rear]= o;
		return true;
	}
	public Object[] getQue()
	{
		return s;
	}
	public Object dequeue()
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 

		Object e= s[front];

		front++;
		return e;
	}
	public String toString()
	{
		return  Arrays.toString(s);
	}
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}
