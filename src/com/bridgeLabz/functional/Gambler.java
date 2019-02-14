package com.bridgeLabz.functional;

import java.util.Scanner;

import com.Util.functional.*;

import Util.UtilClass;

public class Gambler
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input; 
			do 
			{
				System.out.println("Enter the stake");
				input=sc.next();
			}while(!UtilClass.isNumeric(input));
			
			int stake=Integer.parseInt(input);
			
			String input1;
			do
			{
				System.out.println("Enter your goal");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
			
			int goal=Integer.parseInt(input1);
			
			String input2;
			do
			{
				System.out.println("Enter the number of games");
				input2=sc.next();
			}while(!UtilClass.isNumeric(input2));
			
			int games=Integer.parseInt(input2);
			sc.close();
			if(stake>0 && stake<goal)
				UtilClass.gambler(stake,goal,games);
			else
				System.out.println("Stake should be less the goal and greater than zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
