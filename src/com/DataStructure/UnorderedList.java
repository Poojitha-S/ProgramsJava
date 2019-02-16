package com.DataStructure;

/**
 * @author admin1
 *
 * @param <T>
 */
public class UnorderedList<T> implements List<T>
{
	private Node<T> first;//pointer to first node
	private Node<T> last; //pinter to last node
	public UnorderedList() 
	{
		this.first = null;
		this.last = null;
	}
	@Override
	public void add(T ele) 
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
	@Override
	public void print() 
	{
		Node<T> temp=first;
		System.out.println("Elements are:");
		while(temp!=null)
		{
			System.out.print(temp.getData());
			temp=temp.getNext();
		}
		System.out.println();
	}
	@Override
	public boolean search(T eleSearch) 
	{
		Node<T> temp=first;
		if(first==null && last==null)
			return false;
		else
		{
			while(temp!=null)
			{
				if(temp.getData().equals(eleSearch))
					return true;
				else
					temp=temp.getNext();
			}
		}
		return false;
	}
	@Override
	public void remove(T item)
	{
		Node<T>	temp=null;
		Node<T> curr=null;
		if(isEmpty())
			System.out.println("List is empty");
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

	@Override
	public boolean isEmpty()
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
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	@Override
	public void append(T item) 
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
				temp=temp.getNext();
			}
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
	public int index(T item) 
	{
		if(isEmpty())
		{
			System.out.println("List is empty...!");
			return -1;
		}
		Node<T> curr=first;
		int  count=-1;
		int temp=0;
		while(curr!=null)
		{
			count++;
			if(curr.getData()==item)
				temp=count;
		}
		return temp;
	}
	@Override
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

}
