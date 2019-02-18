package com.algorithm;

import java.util.Scanner;

import com.util.UtilClass;

public class Binary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number");
			int decimal=sc.nextInt();
			String res=UtilClass.toBinary(decimal);
			System.out.println("Entered decimal equivalent binary number:");
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
