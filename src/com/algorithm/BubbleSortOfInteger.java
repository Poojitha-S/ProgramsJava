package com.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

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
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
