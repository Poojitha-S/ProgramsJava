package com.bridgeit.datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
		
public class OrderedList<T>
{
	private Node<T> first;//pointer to first node
	private Node<T> last;//pinter to last node
	public OrderedList()
	{
		first=null;//Initializing first with null
		last=null;//Initializing last with null
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
			Node<T> newNode=new Node<T>(item);//creating node with element
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
		//For only one node
		else if(first.getData().equals(item) &&first.getNext()==null)//Checking for only first node
		//Releasing first node initializing with null
		{
			first=null;
			last=null;
		}//Searching ele is first element
		else if(first.getData().equals(item) &&first.getNext()!=null)
		{
			temp=first;//Storing first node in temp and realizing temp
			first=first.getNext();
			temp=null;
			System.out.println(item+" removed from the list");
		}//Other than first element
		else 
		{
			temp=first;
			curr=first.getNext();//Pointing to previous node of temp
			while(curr!=null) {
				if(curr.getData().equals(item))//Checking previous node is searching node
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
	public boolean search(T item) 
	{
		if(first==null)//Empty ll
			return false;
		Node<T> temp=first;
		while(temp!=null) 
		{
			if(temp.getData().equals(item))//Checking equality
				return true;
			temp=temp.getNext();//To traverse next
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
		if(first==last)//For only one node
		{
			Node<T> temp=first;
			first=last=null;
			return temp.getData();//return first node
		}
		Node<T> curr=first;
		Node<T> prev=first;
		while(curr.getNext()!=null)
		{
			prev = curr;
			curr = curr.getNext();
		}
		last=prev;//Holding previous node as last
		last.setNext(null);//releasing last node
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
	public boolean isEmpty() //Checks LL is empty or not
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
			count++;//Getting count of index
			temp=temp.getNext();//Traverse next
		}
		return count;//return size
	}
	public int index(T item) //Return index of searched node
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
			count++;//Getting count of index
			if(curr.getData()==item)
				return count;//if found return count

		}
		System.out.println(item+"not found in the list");
		return -1;
	}
	public void printOrderedList() 
	{
		Node<T> curr=first;//To start travel from first node
		while(curr!=null)
		{
			System.out.println(" "+curr.getData());
			curr=curr.getNext();//Traverse to next node
		}
		System.out.println();
	}
	public void printList() 
	{
		Node<T> curr=first;//To start travel from first node
		while(curr!=null)
		{
			System.out.print(curr.getData()+" ");
			curr=curr.getNext();//Traverse to next node
		}
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

	

	

  