package com.bridgeit.datastructure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.bridgeit.util.*;
public class Hashing {

	public static void main(String[] args) throws IOException
	{	
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/admin1/Desktop/Files/hashProgram.txt");  
		String[] str=Utility.readFromFile(file);
		int[] num=Utility.stringToIntArray(str);

		HashMap<Integer,OrderedList<Integer>> hashTable=new HashMap<>();
		for(int i=0;i<11;i++) 
			hashTable.put(i,null);
		
		for (int i=0;i<num.length;i++)
			addToHashTable(hashTable,num[i]);
		
		printHashTable(hashTable);
		
		System.out.println("\nEnter a key to be searched");
		int key=sc.nextInt();
		if(searchKey(hashTable,key)) 
			System.out.println(key+" is present, so removed from the hash table");
		else
			System.out.println(key +" is not present, so added to the hash table");
		
		printHashTable(hashTable);
		int[] arr=toArray(hashTable);
		Utility.writeToFile(arr, file);
	}
	public static void addToHashTable(HashMap<Integer,OrderedList<Integer>> hashTable, int num)
	{
		int slot=num%hashTable.size();
		OrderedList<Integer> list=hashTable.get(slot);
		if(list==null)
			list=new OrderedList<Integer>();
		list.add(num);
		hashTable.put(slot, list);
	}
	public static boolean searchKey(HashMap<Integer,OrderedList<Integer>> hashTable, int key) 
	{
		boolean isPresent=false;
		int slot=key%hashTable.size();
		OrderedList<Integer>list=hashTable.get(slot);
		if(list==null) 
		{
			isPresent=false;
			list=new OrderedList<Integer>();
			list.add(key);
		}
		else if(list.search(key))
		{
			isPresent=true;
			list.remove(key);
		}
		else 
		{
			isPresent=false;
			list.add(key);
		}
		hashTable.put(slot,list);
		return isPresent;
	}
	public static void printHashTable(HashMap<Integer,OrderedList<Integer>> hashTable) 
	{
		System.out.println("-----------------");
		System.out.println("Keys \t Values ");
		System.out.println("-----------------");
		for(Integer key:hashTable.keySet())
		{
			OrderedList<Integer> list=hashTable.get(key);
			System.out.printf(key+" --> ");
			if(list!=null)
			     list.printList();
			System.out.println();
		}
	}
	public static int[] toArray(HashMap<Integer,OrderedList<Integer>> hashTable) 
	{
		String nums="";
		for(Integer key:hashTable.keySet()) 
		{
			OrderedList<Integer> list=hashTable.get(key);
		    while(list!=null && list.getFirst()!=null) 
		       	nums=nums+list.pop()+",";
		}
		String[] arr=nums.split(",");
		return Utility.stringToIntArray(arr);
	}
}
