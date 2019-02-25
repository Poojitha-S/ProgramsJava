package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class BubbleSortOfInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the size of integer array");
			int n=sc.nextInt();
			System.out.println("Enter the array of integers:");
			int[] a=Utility.readArray(n);
			Integer[] a1 = new Integer[a.length];
			int i=0;
			for (int value : a) 
			   a1[i++] = Integer.valueOf(value);
			Utility.genericBubbleSort(a1);
			System.out.println("Sorted array ");
			for(Integer res:a1)
			{
				System.out.print(res+" ");
			}	
			System.out.println();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
