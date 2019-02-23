package com.bridgeit.functional;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class DistinctCoupon 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the coupon number");			
			int num=sc.nextInt();
			System.out.println(Utility.distinctCoupon(num));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
			
	}
}
