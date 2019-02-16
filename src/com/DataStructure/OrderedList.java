package com.DataStructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
		
public class OrderedList<T>
{
	private Node<T> first;
	private Node<T> last;
	public OrderedList()
	{
		first=null;
		last=null;
	}
	public void add(T item)
	{
		if(isEmpty())
		{
			first=new Node<T>(item);
			last=first;
			return;
		}
		if(!search(item))
		{
			Node<T> newNode=new Node<T>(item);
			Node<T> curr=first;
			Node<T> prev=null;
			while(curr!=null && curr.compareTo(item)<0) 
			{
				prev=curr;
				curr=curr.getNext();
			}
			if(curr!=null && curr==first) 
			{
				newNode.setNext(curr);
				first=newNode;
			}
			else if(curr!=null) 
			{
				prev.setNext(newNode);
				newNode.setNext(curr);
			}
			else 
			{
				last.setNext(newNode);
				last=newNode;
			}
		}
		else
			System.out.printf("Item already exits in the list");
	}
	public void remove(T item) 
	{
		Node<T>	temp=null;
		Node<T> curr=null;
		if(isEmpty())
				System.out.println("List is empty");
		else if(first.getData().equals(item) &&first.getNext()==null)
		{
			first=null;
			last=null;
		}
		else if(first.getData().equals(item) &&first.getNext()!=null)
		{
			temp=first;
			first=first.getNext();
			temp=null;
			System.out.println(item+" removed from the list");
		}
		else 
		{
			temp=first;
			curr=first.getNext();
			while(curr!=null) {
				if(curr.getData().equals(item))
				{
					temp.setNext(curr.getNext());
					curr.setNext(null);
					System.out.println(item+" removed from the list");
						break;
				}
				else {
					temp=curr;
					curr=curr.getNext();
				}
			}
		}
	}
	public boolean search(T item) 
	{
		if(first==null)
			return false;
		Node<T> temp=first;
		while(temp!=null) 
		{
			if(temp.getData().equals(item))
				return true;
			temp=temp.getNext();
		}
		return false;
	}
	public T pop() 
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return null;
		}
		if(first==last)
		{
			Node<T> temp=first;
			first=last=null;
			return temp.getData();
		}
		Node<T> curr=first;
		Node<T> prev=first;
		while(curr.getNext()!=null)
		{
			prev = curr;
			curr = curr.getNext();
		}
		last=prev;
		last.setNext(null);
		return curr.getData();
	}
	public T pop(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return null;
		}
		Node<T> curr=first;
		Node<T> prev=first;
		int  count=-1;
		while(curr!=null) 
		{
			count++;
			if(count==pos &&count==0)
			{
				first=curr.getNext();
				curr.setNext(null);
				return curr.getData();
			}
			else if(count==pos&&curr==last) 
			{
				last=prev;
				last.setNext(null);
				return curr.getData();
			}
			else if(count==pos)
			{
				prev.setNext(curr.getNext());
				curr.setNext(null);
				return curr.getData();
			}
			prev=curr;
			curr=curr.getNext();
		}
		System.out.println("Given position is not found in the list");
		return null;
	}
	public boolean isEmpty() 
	{
		if(first==null)
			return true;
		else
			return false;
	}
	public int size()
	{
		int count = 0;
		Node<T> temp=first;
		while(temp!=null) 
		{
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	public int index(T item) 
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return -1;
		}
		Node<T> curr=first;
		int  count=-1;
		while(curr!=null) 
		{
			count++;
			if(curr.getData()==item)
				return count;
		}
		System.out.println(item+"not found in the list");
		return -1;
	}
	public void printOrderedList() 
	{
		Node<T> curr=first;
		while(curr!=null)
		{
			System.out.print(" "+curr.getData());
			curr=curr.getNext();
		}
		System.out.println();
	}
	public void writeToFile(OrderedList<T> list,String f) 
	{
		Node<T> temp=first;
		BufferedWriter bw=null;
		try
		{
			if(!list.isEmpty())
			{
				bw=new BufferedWriter(new FileWriter(f,false));
				while(temp!=null)
				{
					bw.write(temp.getData()+", ");
					temp=temp.getNext();
				}
				
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bw!=null)
			{
				try{
					bw.close();
				}catch(IOException e)
				{
						e.printStackTrace();
				}
			}
		}
	}
	public Node<T> getFirst()
	{
		return this.first;
	}
}

	

	

  