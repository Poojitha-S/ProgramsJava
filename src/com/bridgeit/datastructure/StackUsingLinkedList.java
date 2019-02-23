package com.bridgeit.datastructure;

public class StackUsingLinkedList<T> 
{
	private Node<T> first;
	private Node<T> last;
	public StackUsingLinkedList()
	{
		first=null;
		last=null;
	}
	public void push(T ele) 
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
	public T pop()
	{
		Node<T> temp=first;
		Node<T> prev=first;
		if(isEmpty())
			return null;
		if(first==last)
		{
			 first.setNext(null);
			 last.setNext(null);
			 return first.getData();
		}
		while(temp.getNext()!=null)
		{
			prev=temp;
			temp=temp.getNext();
		}
		last=prev;
		last.setNext(null);
		return temp.getData();
	}
	public boolean isEmpty()
	{
		if(first==null)	return true;
		else return false;
	}
	
	public T pop(int pos) 
	{
		int count=-1;
		Node<T> temp=first;
		Node<T> prev=first;
		if(isEmpty())
			return null;
		while(temp!=null)
		{
			count++;
			if(count==0 && count==pos)
			{
				first=temp.getNext();
				temp.setNext(null);
				return temp.getData();
			}
			else if(count==pos && temp==last)
			{
				prev=last;
				last.setNext(null);
				return last.getData(); 
			}
			else if(count==pos)
			{
				prev.setNext(temp.getNext());
				temp.setNext(null);
				return temp.getData();
			}
			prev=temp;
			temp=temp.getNext();
		}
		return null;		
	}
	public void print() 
	{
		Node<T> temp=first;
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println();
	}
}
