package com.bridgeLabz.functional;
import java.util.Scanner;

import Util.UtilClass;

public class TwoDimensionalArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1; 
			do
			{
				System.out.println("Enter num of rows: ");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
				
			int rows=Integer.parseInt(input1);
		    String input2;
		    do
		    {
		    	System.out.println("Enter num of columns: ");
				input2=sc.next();
			}while(!UtilClass.isNumeric(input2));
		    
			int cols=Integer.parseInt(input2);
			System.out.println("Total no of elements :"+rows*cols);
		    System.out.println("Enter elements of 2D array");
		    int[][] arr=new int[rows][cols];
		    
		    UtilClass.read2D(arr,rows,cols);
		    System.out.println("Elements of 2D array :");
		    UtilClass.display2D(arr,rows,cols);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    
	 }
}