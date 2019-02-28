package com.bridgeit.datastructure;

public class RemovalOfDuplicates<T>
{
	private Node<T> first;
	private Node<T> last; 
	public RemovalOfDuplicates()
	{
		this.first = null;
		this.last = null;
	}
	
	public void add(T ele)
	{
		Node<T> node=new Node<T>(ele);
		if(first==null && last==null)
			first=last=node;  
		else
		{
			Node<T> curr=first;
			Node<T> prev=null;
			while(curr!=null && curr.compareTo(ele)<0) 
			{
				prev=curr;
				curr=curr.getNext();
			}
			if(curr!=null && curr==first) 
			{
				node.setNext(curr);
				first=node;
			}
			else if(curr!=null) 
			{
				prev.setNext(node);
				node.setNext(curr);
			}
			else 
			{
				last.setNext(node);
				last=node;
			}
		}
		checkDuplicates();	
	}
	public void checkDuplicates()
	{
		Node<T>	temp=null;
		Node<T> curr=null;
		temp=first;
		curr=first.getNext();
		while(curr!=null)
		{
			if(curr.getData().equals(temp.getData()))
			{
				temp.setNext(curr.getNext());
				curr.setNext(null);
				break;
			}
			else 
			{
				temp=curr;
				curr=curr.getNext();
			}
		}
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
