package com.DataStructure;

public class TestUnorderedList {

	public static void main(String[] args) 
	{
	UnorderedList<Integer> un=new UnorderedList<Integer>();
	System.out.println(un.isEmpty());
	un.add(0);
	un.add(1);
	un.add(2);
	un.add(3);
	un.add(4);
	System.out.println(un.pop());
	un.add(5);
	un.print();
	System.out.println(un.search(0));
System.out.println(un.search(9));
	un.remove(2);
	un.print();
	un.append(56);
	un.print();
	System.out.println(un.size());
	System.out.println(un.pop(4));
	}

}
