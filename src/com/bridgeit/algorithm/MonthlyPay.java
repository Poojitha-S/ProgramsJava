package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class MonthlyPay {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int P=Integer.parseInt(args[0]);			
			int Y=Integer.parseInt(args[1]);
			double R=Double.parseDouble(args[2]);
			double monthlyPay=Utility.monthlyPayment(P, Y, R);
			System.out.println("Monthly payment :"+monthlyPay);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}

	}
}

