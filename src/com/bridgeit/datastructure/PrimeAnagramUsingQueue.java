package com.bridgeit.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class PrimeAnagramUsingQueue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print prime number:");
		int range=sc.nextInt();
		List<Integer> num=new ArrayList<Integer>();
		num=Utility.prime(0,range);
		List<Integer> li=new ArrayList<Integer>();
		li=Utility.checkPrimeAnagram(num);
		QueueUsingLinkedList list=new QueueUsingLinkedList();
		int count=0;
		System.out.println("Order of insertion:");
		for(int i=0;i<li.size();i++) 
		{
			Integer temp=li.get(i);
			list.enQueue(temp);
			count++;
		}
		list.show();
		System.out.println();
		System.out.println("Order of deletion:");
		for(int i=0;i<count;i++)
			System.out.print(list.deQueue()+"->");
		sc.close();
	}
}
