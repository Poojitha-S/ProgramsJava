package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class Nibbles 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number : ");
			int decimal=sc.nextInt();
			String res=Utility.toBinary(decimal);
			System.out.println("Binary value of "+decimal+" : "+res);
			int swap=Utility.swapNibbles(decimal);
			System.out.println(" Swapped binary    : "+swap);
			int k=Utility.toDecimal(swap);
			System.out.println("Entered decimal equivalent to swapped binary number : "+k);
			boolean r=Utility.isPowerTwo(k);
			if(r)
				System.out.println(k+" is a power of 2");
			else
				System.out.println(k+" is not a power of 2");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
