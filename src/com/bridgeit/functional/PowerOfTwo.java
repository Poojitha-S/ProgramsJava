package com.bridgeit.functional;

import java.awt.List;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Number should be less then 31");
			System.out.println("Enter the number:");
			int	n=sc.nextInt();
			int[] pow=new int[n];
				pow=Utility.powerOfTwo(n);
			for(int i=0;i<pow.length;i++)
				System.out.println("2^"+i+" = " + pow[i]);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
