package com.bridegLabz.Algorithm;

import java.util.Scanner;

import com.Util.functional.UtilClass;

public class SquareRoot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1;
			do
			{
				System.out.println("Enter the number");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
			double c=Integer.parseInt(input1);
			System.out.println(com.Util.functional.UtilClass.sqrtNewtons(c));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
