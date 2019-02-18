package com.algorithm;

import java.util.Scanner;

import com.util.UtilClass;


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
	        UtilClass.printArray(arr); 
	        UtilClass.sort(arr, 0, arr.length-1); 
	        System.out.println("\nSorted array"); 
	        UtilClass.printArray(arr); 
		}
		catch(Exception e)
		{
			System.out.println("Enter only numbers");
		
		}
	}	
}
