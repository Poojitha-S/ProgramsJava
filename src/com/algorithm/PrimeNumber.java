package com.algorithm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.util.UtilClass;

public class PrimeNumber 
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter lower limt");
			int low=sc.nextInt();
			System.out.println("Enter upper limit");
			int up=sc.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			list=UtilClass.prime(low,up);
			System.out.println("Prime numbers between the range "+"("+low+","+up+")"+" are listed below:");
			for(int num:list)
			{
				System.out.print(num+" ");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
