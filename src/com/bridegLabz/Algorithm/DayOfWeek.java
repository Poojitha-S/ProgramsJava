package com.bridegLabz.Algorithm;


import java.util.Scanner;

import com.Util.functional.*;
public class DayOfWeek {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1,input2,input3;
			do
			{
				input1=args[0];
				
			}while(!com.Util.functional.UtilClass.isNumeric(input1));
			int day=Integer.parseInt(input1);	
			do
			{
				input2=args[1];
				
			}while(!com.Util.functional.UtilClass.isNumeric(input2));
			int month=Integer.parseInt(input2);
			do
			{
				input3=args[2];
				
			}while(!com.Util.functional.UtilClass.isNumeric(input1));
			int year=Integer.parseInt(input3);
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
