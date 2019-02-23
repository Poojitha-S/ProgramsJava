package com.bridgeit.datastructure;
import java.util.Scanner;

import com.bridgeit.util.*;
public class BinarySearchTree 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number of nodes");
		int nodes=sc1.nextInt();	
		/*	the formula is 	 nCr=n!/(n-r)!r!
		 * 
		 * formula for binarySearch 2nCn/(n+1) it becomes(2n!)/(n+1)! *n!
		 */	
		 int numerator=Utility.factorial(2*nodes);
		 int denominator1=Utility.factorial(nodes +1);
		 int denominator2=Utility.factorial(nodes);
		 int res=0;
		 try
		 {
			 res=numerator/(denominator1*denominator2);
		 }catch(ArithmeticException e)
		 {
			 throw new IllegalArgumentException("you are getting ArithmeticException");
		 }

		 System.out.println("Total numbers of BST present in "+ nodes+" nodes are : "+res);
		 sc1.close();
	}

}
