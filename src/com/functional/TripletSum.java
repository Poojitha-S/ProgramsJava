package com.functional;

import java.awt.List;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.util.UtilClass;
public class TripletSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter size of arrays:");
			int n=sc.nextInt();
			int[] a=new int[n];			
			System.out.println("Enter array elements:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			//System.out.println("");
			int count=UtilClass.triplets(a, n);
			System.out.println("Number of triplets are:"+count);
		      
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
		
	}

	
}
