package com.bridgeLabz.functional;

import java.util.Scanner;

import Util.UtilClass;

public class LeapYear {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			//int num=String.valueOf(year).length();
			String input;
			do
			{
				System.out.println("Enter the year");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			
			int year=Integer.parseInt(input);
			
			int num=UtilClass.getDigits(year);
			if(num==4)
			{
				boolean res=UtilClass.leap(year);
				if(res)
				{
					System.out.println(year+" is a leap year");
				}
				else
				{
					System.out.println(year+" is not a leap year");
				}
			}
			else
			{
				System.out.println("Year should be in $ digits");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
