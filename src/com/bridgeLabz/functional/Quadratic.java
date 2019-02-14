package com.bridgeLabz.functional;

import java.util.Scanner;

import Util.UtilClass;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		double a=sc.nextDouble();
		System.out.println("Enter value of b");
		double b=sc.nextDouble();
		System.out.println("Enter value of c");
		double c=sc.nextDouble();
		double[] roots=UtilClass.quadratic(a, b, c);
		for(int i=0;i<roots.length;i++)
		{
			if(roots[i]!=0.0)
			{
				System.out.println(roots[i]);
			}
		}
			
	}

}
