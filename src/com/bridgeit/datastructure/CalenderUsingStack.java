package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.util.Utility;

public class CalenderUsingStack {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StackUsingLinkedList<Integer> dateStack=new StackUsingLinkedList<Integer>();
		StackUsingLinkedList<String> weekStack=new StackUsingLinkedList<String>();	
		String[] days= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		String[] Month= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] noOfDays= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		if(month==2 && Utility.leap(year))
			noOfDays[2]=29;
		int count=Utility.dayOfWeek(1, month, year);
		for(int i=days.length-1;i>=0;i--) 
		{
			weekStack.push(days[i]);
		}
		System.out.println("                   "+Month[month]+" "+year);
		System.out.println("---------------------------------------------------");
		for(int i=0;i<days.length;i++) 
		{
			System.out.print(weekStack.pop()+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		for(int i=0;i<count;i++)
		{
			System.out.print("\t");
		}
		for(int i=noOfDays[month];i>=1;i--) 
		{
			dateStack.push(i);
		}
		for(int i=1;i<=noOfDays[month];i++) 
		{
			System.out.print(" "+dateStack.pop()+"\t");
			if((i+count)%7==0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
	}
}
