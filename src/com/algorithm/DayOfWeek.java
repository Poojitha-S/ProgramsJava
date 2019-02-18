package com.algorithm;


import java.util.Scanner;

import com.util.UtilClass;
public class DayOfWeek 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int day=Integer.parseInt(args[0]);	
			int month=Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			int res=UtilClass.dayOfWeek(day,month, year);
			String[] arr={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			System.out.println("Day on "+day+(char)47+month+(char)47+year+" is : "+arr[res]);
		}
		catch(Exception e)
		{
			System.out.println("Enter only numbers");
			e.printStackTrace();
		
		}
	}
}
