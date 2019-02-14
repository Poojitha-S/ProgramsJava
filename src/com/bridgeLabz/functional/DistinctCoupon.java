package com.bridgeLabz.functional;
import java.util.Scanner;


import com.Util.functional.*;

import Util.UtilClass;

public class DistinctCoupon 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter the coupon number");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			
			int num=Integer.parseInt(input);
			System.out.println(UtilClass.distinctCoupon(num));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
}
