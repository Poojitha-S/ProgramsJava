package com.bridgeLabz.functional;

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				input=args[0];
			}while(!com.Util.functional.UtilClass.isNumeric(input));
			
			int n=Integer.parseInt(input);
			while(n>31)
			{
				System.out.println("Number should be less then 31");
				System.out.println("Enter the number again:");
				n=sc.nextInt();
			}
			com.Util.functional.UtilClass.powerOfTwo(n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
