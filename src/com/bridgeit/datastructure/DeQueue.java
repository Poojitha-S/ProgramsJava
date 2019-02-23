package com.bridgeit.datastructure;
import java.util.Arrays;

public class DeQueue<T>
{ 
	int size;	
	Object s[];		
	int front,rear = -1;
	public DeQueue(int size)
	{
		this.size=size;
		s=(T[]) new Object[size];
	}
	public boolean frontEnqueue(T o)
	{
		if(isempty())
			return false;
		if(front-1>=0)
		{
			s[front-1]= o;
			front--;     
			return true;
		}		
	   return false;
	}
	public T frontDequeue()
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		Object e= s[front];
	    front++;
		return (T) e;
	}
	public boolean isempty()
	{
		if(rear==-1 && front==-1)
			return true;					
		else 
			return false;	
	}
	
	public boolean rearEnqueue(T o)
	{
		if(rear==size-1)
			return false;
		s[++rear]= o;
		   return true;
	}
		
	public T rearDequeue() 
	{   
		if(rear==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		Object e= s[rear];
	    rear--;
	    return (T) e;
	}
}
