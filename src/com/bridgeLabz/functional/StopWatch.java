package com.bridgeLabz.functional;

import java.util.Scanner;

import Util.UtilClass;

public class StopWatch
{
	public static void main(String[] args) 
	{
		long start=0,end=0;
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println();
			System.out.println("------------STOP WATCH------------");
			System.out.println("Enter ONE to start watch:");
			System.out.println("Enter TWO to end watch:");
			System.out.println("Enter THREE to know elapse time");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1 :start=UtilClass.startTime();
						break;
				case 2 :end=UtilClass.endTime();
						break;
				case 3 :System.out.println("Elapse time is : "+UtilClass.elapseTime(start,end)+" nano seconds");
						break;
			}
		}while(ch<4);
		
	}
}
