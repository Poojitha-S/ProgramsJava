package com.bridegLabz.Algorithm;

import java.util.Scanner;

import com.Util.functional.*;

import Util.UtilClass;

public class MonthlyPay {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1,input2,input3;
			do
			{
				input1=args[0];
				
			}while(!UtilClass.isNumeric(input1));
			int P=Integer.parseInt(input1);	
			do
			{
				input2=args[1];
				
			}while(!UtilClass.isNumeric(input2));
			int Y=Integer.parseInt(input2);
			do
			{
				input3=args[2];
				
			}while(!UtilClass.isNumeric(input1));
			double R=Double.parseDouble(input3);
			double monthlyPay=UtilClass.monthlyPayment(P, Y, R);
			System.out.println("Monthly payment :"+monthlyPay);
		}
		catch(Exception e)
		{
			System.out.println("Enter only numbers");
			e.printStackTrace();
		
		}

	}
}

