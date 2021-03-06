package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class InsertionStringSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter sentence to sort:");
			String str=sc.nextLine();
			String[] s1=str.split(" ");
			String[] s2=Utility.genInsertionSort(s1);
			for(String s:s2)
			{
				System.out.print(s+" ");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
		
	}	
}
