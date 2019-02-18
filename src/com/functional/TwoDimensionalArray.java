package com.functional;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.util.UtilClass;

public class TwoDimensionalArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter num of rows: ");
			int rows=sc.nextInt();
		    System.out.println("Enter num of columns: ");
			int cols=sc.nextInt();
			System.out.println("Total no of elements :"+rows*cols);
		    System.out.println("Enter elements of 2D array");
		    int[][] arr=new int[rows][cols];
		    
		    UtilClass.read2D(arr,rows,cols);
		    System.out.println("Elements of 2D array :");
			PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out),true);
			for (int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					pw.write(arr[i][j]+" ");//Display array elements using PrintWriter()
				}
				pw.println();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    
	 }
}