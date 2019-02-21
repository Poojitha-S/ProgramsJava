package com.datastructure;

public class QueueUsingLinkedList<T>
{
	private Node<T> first;
	private Node<T> last;
	public QueueUsingLinkedList()
	{
		first=null;
		last=null;
	}
	public void enQueue(T ele) 
	{
		Node<T> node=new Node<T>(ele);
		if(first==null && last==null)
			first=last=node;
		else
		{
			last.setNext(node);
			last=node;
		}
	}
	public void print() 
	{
		Node<T> temp=first;
		System.out.println("Elements are:");
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println();
	}
	public T dequeue() 
    { 
        if (  first == null) 
           return null; 
        Node<T>  temp =   first; 
          first =   first.getNext(); 
        if (  first == null) 
           last = null; 
        return (T) temp.getData(); 
    } 
}
