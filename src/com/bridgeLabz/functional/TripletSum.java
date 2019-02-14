package com.bridgeLabz.functional;

import java.util.Scanner;

import com.Util.functional.*;

import Util.UtilClass;
public class TripletSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter size of arrays:");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			int n=Integer.parseInt(input);
			int[] a=new int[n];			
			System.out.println("Enter array elements:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			UtilClass.triplets(a, n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
}
