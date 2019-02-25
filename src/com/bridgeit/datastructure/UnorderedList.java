package com.bridgeit.datastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class UnorderedList<T> implements List<T>
{
	private Node<T> first;//pointer to first node
	private Node<T> last; //pinter to last node
	public UnorderedList() 
	{
		this.first = null;//Initializing first with null
		this.last = null;//Initializing last with null
	}
	@Override
	public void add(T ele) 
	{
		Node<T> node=new Node<T>(ele);//creating node with element
		if(first==null && last==null)//check if any node exist or not
			first=last=node;//assigning fist and last to node  
		else
		{
			last.setNext(node);//Linking last's next to 
			last=node;//Making new node as last
		}
	}
	
	public void print() 
	{
		Node<T> temp=first;//To start travel from first node
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");//printing node
			temp=temp.getNext();//Traverse to next node
		}
		System.out.println();
	}
	public void showFile() 
	{
		Node<T> temp=first;//To start travel from first node
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");//printing node
			temp=temp.getNext();//Traverse to next node
		}
		System.out.println();
	}
	@Override
	public boolean search(T eleSearch) 
	{
		Node<T> temp=first;
		if(first==null && last==null)//Empty ll
			return false;
		else
		{
			while(temp!=null)
			{
				if(temp.getData().equals(eleSearch))//Checking equality
					return true;
				else
					temp=temp.getNext();//To traverse next
			}
		}
		return false;
	}
	//Return index of searched node
	public int index(T item) 
	{
		Node<T> temp=first;
		int count=-1;
		if(first==null && last==null)
			return -1;
		else
		{
			while(temp!=null)
			{	
				++count;//Getting count of index
				if(temp.getData().equals(item))
				{
					break;//if found break loop
				}
				temp=temp.getNext();//Traverse next
			}
		}
		return count; //return index
	}
	@Override
	public boolean isEmpty()//Checks LL is empty or not
	{
		if(first==null)	return true;
		else return false;
	}
	@Override
	public int size()
	{
		int count=0;
		Node<T> temp=first;
		while(temp!=null) 
		{
			count++;//Getting count of index
			temp=temp.getNext();//Traverse next
		}
		return count;//return size
	}
	
	@Override
	public void append(T item) //Adding node at end of LL
	{
		Node<T> node=new Node<>(item);
		Node<T> temp=first;
		if(isEmpty())
		{
			first=node;
			last=first;
		}
		else
		{
			while(temp!=null)
			{
				temp=temp.getNext();//Traverse next
			}
			last.setNext(node);
			last=node;//Assigning last node with new node
		}
	}
	public T pop()
	{
		Node<T> temp=first;
		Node<T> prev=first;
		if(isEmpty())
			return null;
		if(first==last)//For only one node
		{
			 first.setNext(null);
			 last.setNext(null);
			 return first.getData();//return first node
		}
		while(temp.getNext()!=null)
		{
			prev=temp;
			temp=temp.getNext();
		}
		last=prev;//Holding previous node as last
		last.setNext(null);//releasing last node
		return temp.getData();//returning popped node
	}
	public void writeToFile(UnorderedList<T> list,File f)
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
					bw.write(temp.getData()+" ");
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
	public T pop(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List is empty...!");
			return null;
		}
		Node<T> curr=first;
		Node<T> prev=first;

		int  count=-1;
		while(curr!=null)//traverse to reach the last item in the list
		{
			count++;
			if(count==pos &&count==0)// removal at 0th position, update first
			{
				first=curr.getNext();
				curr.setNext(null);
				return curr.getData();
			}
			else if(count==pos&&curr==last)// removal at the last position
			{
				last=prev;
				last.setNext(null);
				return curr.getData();
			}
			else if(count==pos)//removal in-between
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
	public void remove(T item) //remove item
	{
		Node<T>	temp=null;
		Node<T> curr=null;
		if(isEmpty())
			System.out.println("List is empty...!");
		else if(first.getData().equals(item) && first.getNext() == null)// one item list
		{
			first=null;
			last=null;
		}
		else if(first.getData().equals(item) && first.getNext() != null)//update only first
		{
			
			temp=first;
			first=first.getNext();
			temp=null;
		}
		else 
		{
			temp=first;
			curr=first.getNext();
			while(curr!=null)
			{
				if(curr.getData().equals(item))
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
}
}
