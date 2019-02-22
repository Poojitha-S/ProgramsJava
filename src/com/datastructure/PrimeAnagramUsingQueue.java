package com.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.util.UtilClass;

public class PrimeAnagramUsingQueue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print prime number:");
		int range=sc.nextInt();
		List<Integer> num=new ArrayList<Integer>();
		num=UtilClass.prime(0,range);
		List<Integer> li=new ArrayList<Integer>();
		li=UtilClass.checkPrimeAnagram(num);
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
		
	}
}
