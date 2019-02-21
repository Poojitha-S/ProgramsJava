package com.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class Gambler
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the stake");
			int stake=sc.nextInt();
			System.out.println("Enter your goal");
			int goal=sc.nextInt();
			System.out.println("Enter the number of games");
			int games=sc.nextInt();
			if(stake>0 && stake<goal)
			{
				double win=(int)UtilClass.gambler(stake,goal,games);
				double winPer=win*100/(games);
				double lossPer=100-winPer;
				System.out.println("The number of wins are "+win+", out of "+games+" bets");
				System.out.println("Percentage of wins : "+winPer);
				System.out.println("Percentage of loss : "+lossPer);
			}
			else
				System.out.println("Stake should be less the goal and greater than zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
