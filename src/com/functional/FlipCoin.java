package com.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class FlipCoin 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter number of flips:");
			int flips=sc.nextInt();
			
			while(flips<0)
			{
				System.out.println("Flip counts should be positive, Enter again");
				flips=sc.nextInt();
			}
			double percentHeads = ((double)UtilClass.countOfHead(flips)/flips)*100;
			double percentTails = 100-percentHeads;
			System.out.println("Percentage of heads in "+flips+" flips");
			System.out.printf("%.2f\n", percentHeads);
			System.out.println("Percentage of tails in "+flips+" flips");
			System.out.printf("%.2f\n", percentTails);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}

	
