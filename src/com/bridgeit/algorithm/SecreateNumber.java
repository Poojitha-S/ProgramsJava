package com.bridgeit.algorithm;

import java.util.InputMismatchException;

import java.util.Scanner;
public class SecreateNumber 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		try
		{
			int n=Integer.parseInt(args[0]);
			int mid=0;
			int low=0;
			int high=n-1;
			Scanner sc1=new Scanner(System.in);
			int res=0;
			while(res!=3)
			{
				System.out.println("is "+ mid +" your secret number ?" );
				System.out.println("press 1: if your secret number less than "+mid+" number");
				System.out.println("press 2: if your secret number greater than "+mid+" number");
				System.out.println("press 3: if your secret number is "+mid+" number");
		
				res=sc1.nextInt();
				if(res==1)
				{
					high=mid-1;
					mid=(low+high)/2;
		
				}
				else if(res==2)
				{
					low=mid+1;
					mid=(low+high)/2;
				}
			}
			System.out.println("your number is "+mid );
			sc1.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
