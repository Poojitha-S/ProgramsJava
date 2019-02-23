package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.util.Utility;


public class MergeStringSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter sentence to sort:");
			String str=sc.nextLine();
			String[] arr=str.split(" ");
	        System.out.println("Given Array"); 
	        Utility.printArray(arr); 
	        Utility.sort(arr, 0, arr.length-1); 
	        System.out.println("\nSorted array"); 
	        Utility.printArray(arr); 
		}
		catch(Exception e)
		{
			System.out.println("Enter only numbers");
		
		}
	}	
}
