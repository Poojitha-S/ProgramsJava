package com.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			System.out.println("Enter the number:");
			int	n=sc.nextInt();
			System.out.println(UtilClass.primeFactors(n));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}

}
