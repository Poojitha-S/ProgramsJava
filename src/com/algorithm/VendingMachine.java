package com.algorithm;
import java.util.Scanner;

import com.util.UtilClass;

public class VendingMachine
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the amount in rupees:");
			int rup=sc.nextInt();
			int[] typeOfNotes={1000,500,100,50,10,5,2,1};
			if(rup>0)
				UtilClass.vendingMachine(rup, typeOfNotes);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
