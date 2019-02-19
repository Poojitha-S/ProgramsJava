package com.algorithm;
import java.util.*;
import java.util.InputMismatchException;
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
			int[] notes= UtilClass.vendingMachine(rup, typeOfNotes);
			System.out.println("------------------");
			System.out.println("Notes : NumofNotes");
			System.out.println("------------------");
			for(int i=0;i<notes.length;i++)
			{
				int res=rup/typeOfNotes[i];
				if(res>0)
				{
				if(notes[i]!=0)
					System.out.println(notes[i]+":"+typeOfNotes[i]);	
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}	
	}
}
