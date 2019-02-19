package com.functional;
import java.util.InputMismatchException;
import java.util.Scanner;


import com.util.UtilClass;

public class DistinctCoupon 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the coupon number");			
			int num=sc.nextInt();
			System.out.println(UtilClass.distinctCoupon(num));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
			
	}
}
