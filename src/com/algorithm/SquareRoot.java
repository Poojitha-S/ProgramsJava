package com.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class SquareRoot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number");
			double c=sc.nextDouble();
			System.out.println(UtilClass.sqrtNewtons(c));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
