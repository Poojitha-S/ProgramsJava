package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.util.Utility;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double root1;
		double root2;
		System.out.println("Enter value of a");
		double a=sc.nextDouble();
		System.out.println("Enter value of b");
		double b=sc.nextDouble();
		System.out.println("Enter value of c");
		double c=sc.nextDouble();
		double delta=Utility.quadraticDetla(a, b, c);
		System.out.println("Delta = "+delta);
		if(delta>0)
		{
			System.out.println("Roots are real and unequal");
			root1=-b+(Math.sqrt(delta))/(2*a);
			root2=-b-(Math.sqrt(delta))/(2*a);
			System.out.println("Roots are:");
			System.out.println("Root1 = "+root1);
			System.out.println("Root2 = "+root2);
		}
		else if(delta==0)
		{
			System.out.println("Roots are real and equal");
			root1=(int)(-b/(2*a));			
			System.out.println("Root is:");
			System.out.println("Root1 = "+root1);
		}
		else
		{
			System.out.println("roots are imaginary");
		}			
	}
}
