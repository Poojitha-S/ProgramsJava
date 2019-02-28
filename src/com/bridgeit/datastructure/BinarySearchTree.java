package com.bridgeit.datastructure;
import java.math.BigInteger;
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
		 BigInteger res=new BigInteger("1");
		 BigInteger numerator=new BigInteger("1");
		 BigInteger denominator1=new BigInteger("1");
		 BigInteger denominator2=new BigInteger("1");
		 numerator=Utility.factorial(2*nodes);
		 denominator1=Utility.factorial(nodes +1);
		 denominator2=Utility.factorial(nodes);
		 try
		 {
			 res=numerator.divide((denominator1).multiply(denominator2));
		 }catch(ArithmeticException e)
		 {
			 throw new IllegalArgumentException("you are getting ArithmeticException");
		 }

		 System.out.println("Total numbers of BST present in "+ nodes+" nodes are : "+res);
		 sc1.close();
	}

}
