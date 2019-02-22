package com.datastructure;
import java.util.Scanner;

import com.util.*;
public class BinarySearchTree 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number of nodes...");
		int nodes=sc1.nextInt();	

		/*	the formula is 	 nCr=n!/(n-r)!r!
		 * 
		 * formula for binarySearch 2nCn/(n+1) it becomes(2n!)/(n+1)! *n!
		 */	
		 int result1=UtilClass.factorial(2*nodes);
		 int result2=UtilClass.factorial(nodes +1);
		 int result3=UtilClass.factorial(nodes);
		 int finalResult=0;
		 try
		 {
			 finalResult=result1/(result2*result3);
		 }catch(ArithmeticException e)
		 {
			 throw new IllegalArgumentException("you are getting ArithmeticException");
		 }

		 System.out.println("Total numbers of BST is :"+finalResult);
		 sc1.close();
	}

}
