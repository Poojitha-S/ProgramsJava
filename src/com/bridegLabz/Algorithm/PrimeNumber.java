package com.bridegLabz.Algorithm;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import Util.UtilClass;

public class PrimeNumber 
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1;
			do
			{
				System.out.println("Enter lower limt");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
			int low=Integer.parseInt(input1);
			String input2;
			do
			{
				System.out.println("Enter upper limit");
				input2=sc.next();
			}while(!UtilClass.isNumeric(input2));
			int up=Integer.parseInt(input2);
			List<Integer> list=new ArrayList<Integer>();
			list=UtilClass.isPrime(low,up);
			System.out.println("Prime numbers between the range "+"("+low+","+up+")"+" are listed below:");
			for(int num:list)
			{
				System.out.print(num+" ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
