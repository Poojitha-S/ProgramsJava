package com.bridgeit.datastructure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.bridgeit.util.*;
public class HashProgram {

	public static void main(String[] args) throws IOException
	{	
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/admin1/Desktop/Files/hashProgram.txt");  
		String[] str=Utility.readFromFile(file);
		int[] num=Utility.stringToIntArray(str);
		//create hash table of ordered link list
		HashMap<Integer,OrderedList<Integer>> hashTable=new HashMap<>();
		for(int i=0;i<11;i++) 
			hashTable.put(i,null);
		//add all the numbers to appropriate slot in hash table
		for (int i=0;i<num.length;i++)
			addToHashTable(hashTable,num[i]);
		
		printHashTable(hashTable);
		
		System.out.println("\nEnter a key to be searched");
		int key=sc.nextInt();
		if(searchKey(hashTable,key)) 
			System.out.println(key+" is present");
		else
			System.out.println(key +" is not present");
		
		printHashTable(hashTable);
		int[] arr=toArray(hashTable);
		Utility.writeToFile(arr,file);//writing the hash table to a file
	}
	/**
	 * adding a number to slot
	 * @param hashTable 
	 * @param num 
	 */
	public static void addToHashTable(HashMap<Integer,OrderedList<Integer>> hashTable, int num)
	{
		int placeHolder=num%hashTable.size();//place to hold value
		OrderedList<Integer> list=hashTable.get(placeHolder);
		if(list==null)
			list=new OrderedList<Integer>();//new list for values those are not added
		list.add(num);//added to list of values
		hashTable.put(placeHolder, list);//add value to respective key
	}
	/**
	 * searches a key is present in the hash table; if present removes it otherwise adds to the table
	 * @param hashTable
	 * @param key
	 * @return true if key present else false
	 */
	public static boolean searchKey(HashMap<Integer,OrderedList<Integer>> hashTable, int key) 
	{
		boolean flag=false;
		int placeHolder=key%hashTable.size();//get key value of element to be searched
		OrderedList<Integer>list=hashTable.get(placeHolder);//get value present in key
		if(list==null) //for new key value pair
		{
			flag=false;
			list=new OrderedList<Integer>();//create new list
			list.add(key);//added to list
		}
		else if(list.search(key))//if pres
		{
			flag=true;
			list.remove(key);
		}
		else  //if not present added to list
		{
			flag=false;
			list.add(key);
		}
		hashTable.put(placeHolder,list);//add key value pair
		return flag;
	}
	/**
	 * printing all the numbers in the hash table
	 * @param hashTable hash table of numbers
	 */
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
	/**
	 * converting the hash table to array
	 * @param hashTable
	 * @return array of hash table data
	 */
	public static int[] toArray(HashMap<Integer,OrderedList<Integer>> hashTable) 
	{
		int[] temp=new int[hashTable.size()];
		String nums="";
		for(Integer key:hashTable.keySet()) 
		{
			OrderedList<Integer> list=hashTable.get(key);
		    while(list!=null && list.getFirst()!=null) 
		       //	nums=nums+list.pop()+",";
		    	temp[key]=list.pop();
		}
		//String[] arr=nums.split(",");
	//	return Utility.stringToIntArray(arr);
		return temp;
	}
}
