package com.bridgeLabz.functional;

import java.util.Scanner;


import com.Util.functional.*;

import Util.UtilClass;

public class FlipCoin 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				System.out.println("Enter number of flips:");
				input=sc.next();
			}while(!input.matches("[0-9[+]]+"));
			
			int flips=Integer.parseInt(input);
			
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
		catch(Exception e)
		{
			System.out.println("Enter only numbers");
		
		}
	}
}

	
