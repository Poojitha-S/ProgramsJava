package com.bridegLabz.Algorithm;

import java.util.Scanner;

import com.Util.functional.*;

import Util.UtilClass;

public class Binary
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
			int decimal=Integer.parseInt(input);
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
