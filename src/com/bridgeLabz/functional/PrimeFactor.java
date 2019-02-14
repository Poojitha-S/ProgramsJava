package com.bridgeLabz.functional;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter the number");
				input=sc.next();
			}while(!com.Util.functional.UtilClass.isNumeric(input));
			
			int n=Integer.parseInt(input);
			com.Util.functional.UtilClass.primeFactors(n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
