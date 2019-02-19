package com.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class LeapYear {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the year");
			int year=sc.nextInt();
			
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
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
