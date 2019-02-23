package com.bridgeit.datastructure;
public class QueueUsingLinkedList 
{
	@SuppressWarnings("rawtypes")
	Node front;
	Node rear;
    int size=0; 
	public void enQueue(Object data)
	{
		Node node=new Node();
		node.setData(data);
		node.setNext(null);
		if(front==null)
		{
			front=node;
			rear =node;
			node.setNext(null);						
		    size++;
		}
		else
		{   
			rear.setNext(node);
			rear = node;  
			node.setNext(null);  					
		    size++;
		}
	}		
	public Object deQueue()
	{
		Object temp=0;
		if(front==null)
			return null;
		else
		{
		    temp =front.getData();
		    front=front.getNext();
		}
		return temp;
	}
	public int size()
	{
		return size;
	}
	public void show()
	{
		Node temp;
		temp= front;
		if(front== null)
			 System.out.println("Queue is empty");
		else
		{
			while(temp!= null)
			{
				System.out.print(temp.getData()+"->");
				temp =temp.getNext();
			}
		}
	}	
}
