package com.bridgeLabz.functional;

import java.util.Scanner;

import Util.UtilClass;

public class NthHormonicSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter the number");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			
			int n=Integer.parseInt(input);
			while(n==0)
			{
				System.out.println("Number should not be equal to zero");
				System.out.println("Enter the number again:");
				n=sc.nextInt();
			}
			double res=UtilClass.hormonicSum(n);
			System.out.println("Sum of "+n+"th hormonic number is "+res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
