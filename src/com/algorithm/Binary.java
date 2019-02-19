package com.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class Binary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int decimal;
		try
		{
			System.out.println("Enter the number");
			decimal=sc.nextInt();
			String res=UtilClass.toBinary(decimal);
			System.out.println("Entered decimal equivalent binary number:");
			System.out.println(res);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
