package com.bridgeit.datastructure;
public class DeQueueImplementation<T>
{	
	int size;	
	private Node<T> front;//pointer to front node
	private Node<T> rear; //pinter to rear node
	public DeQueueImplementation() 
	{
		this.front = null;//Initializing front with null
		this.rear = null;//Initializing rear with null
	}
	public void rearEnqueue(T ele)
	{
			Node<T> node=new Node<T>(ele);//creating node with element
			if(front==null && rear==null)//check if any node exist or not
				front=rear=node;//assigning fist and rear to node  
			else
			{
				rear.setNext(node);//Linking rear's next to 
				rear=node;//Making new node as rear
			}
			size++;
	}
	
	public T rearDequeue()
	{
		Node<T> temp=front;
		Node<T> prev=front;
		if(isEmpty())
			return null;
		if(front==rear)//For only one node
		{
			 front.setNext(null);
			 rear.setNext(null);
			 return front.getData();//return front node
		}
		while(temp.getNext()!=null)
		{
			prev=temp;
			temp=temp.getNext();
		}
		rear=prev;//Holding previous node as rear
		rear.setNext(null);//releasing rear node
		size--;
		return temp.getData();//returning popped node
	}
	public T frontDequeue() 
	{
		if(front==null)
			return null;
		Node<T> temp=front;
		front=front.getNext();
		size--;
		return temp.getData();
	}
	public void frontEnqueue(T ele)
	{
		Node<T> node=new Node<T>(ele);//creating node with element
		if(front==null && rear==null)//check if any node exist or not
			front=rear=node;//assigning fist and rear to node  
		else
		{
			node.setNext(front);
			front=node;
		}
		size++;
	}
	public boolean isEmpty()//Checks LL is empty or not
	{
		if(front==null)	return true;
		else return false;
	}

	/*int size;	
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
	}*/
/*	public boolean isempty()
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
	}*/
}

  