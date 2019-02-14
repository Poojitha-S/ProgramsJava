package com.bridegLabz.Algorithm;

import java.util.Scanner;

import Util.UtilClass;

public class BubbleSortOfInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter the size of integer array");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			
			int n=Integer.parseInt(input);
			System.out.println("Enter the array of integers:");
			int[] a=UtilClass.readArray(n);
			Integer[] a1 = new Integer[a.length];
			int i=0;
			for (int value : a) 
			{
			    a1[i++] = Integer.valueOf(value);
			}
			UtilClass.genericsBubbleSort(a1);
			System.out.println("Sorted array ");
			for(Integer k:a1)
			{
				System.out.print(k+" ");
			}	
			System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
