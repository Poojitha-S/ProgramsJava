package com.bridgeit.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class PrimeAnagramUsingStack
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
		StackUsingLinkedList<Integer> list=new StackUsingLinkedList<>();
		int count=0;
		System.out.println("Order of insertion:");
		for(int i=0;i<li.size();i++) 
		{
			Integer temp=li.get(i);
			list.push(temp);
			count++;
		}
		list.print();
		System.out.println("Order of deletion:");
		for(int i=0;i<count;i++) {
		//	System.out.print(list.pop()+"->");
		}
		List lis ;
		for(int i=0;i<count;i++)
		{
		Object k=(Object) list.pop();
		lis =java.util.Arrays.asList(k);
		}
		//UtilClass.twoDPrime(lis);
	}

}
