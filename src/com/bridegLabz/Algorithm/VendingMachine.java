package com.bridegLabz.Algorithm;
import java.util.Scanner;

import Util.UtilClass;

public class VendingMachine
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1;
			do
			{
				System.out.println("Enter the amount in rupees:");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
			int rup=Integer.parseInt(input1);
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
