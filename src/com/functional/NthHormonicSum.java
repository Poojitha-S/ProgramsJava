package com.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class NthHormonicSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{	
			System.out.println("Enter the number");
			int n=sc.nextInt();
			while(n==0)
			{
				System.out.println("Number should not be equal to zero");
				System.out.println("Enter the number again:");
				n=sc.nextInt();
			}
			double res=UtilClass.hormonicSum(n);
			System.out.println("Sum of "+n+"th hormonic number is "+res);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}

}
