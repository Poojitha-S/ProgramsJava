package com.datastructure;

import java.util.Scanner;

import com.util.UtilClass;

public class CalenderUsingQueue 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		QueueUsingLinkedList Queue= new QueueUsingLinkedList();
		QueueUsingLinkedList subQueue= new QueueUsingLinkedList();
		System.out.println("Enter a month");
		int month = sc.nextInt();
		System.out.println("Enter the year");
		int year =  sc.nextInt();
		int count= UtilClass.dayOfWeek(1, month, year);
		String[] Month={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("                   "+Month[month]+" "+year);
		System.out.println("---------------------------------------------------");
		System.out.println("S\t"+"M\t"+"T\t"+"W\t"+"T\t"+"F\t"+"S");;
		System.out.println("---------------------------------------------------");
		int[] noOfDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//Checking year leap or not
		if(month==2 && UtilClass.leap(year))
			noOfDays[1]=29;//assigning 29 to represent leap year
		for (int i = 1; i <= noOfDays[month]; i++)//Loops no of days in a moth time  
		{  			
			subQueue.enQueue(i);//a			
			if ((i + count) % 7 == 0 || i==noOfDays[month] ) 
			{
				Queue.enQueue(subQueue);
				subQueue=new QueueUsingLinkedList(); 
			}
		}
		for (int i=0;i<count;i++)
			System.out.print("\t");
		for (int i=0 ;i<Queue.size();i++)
		{
			QueueUsingLinkedList week=(QueueUsingLinkedList) Queue.deQueue();
			for (int j=0;j<week.size();j++)
			{
				System.out.print(week.deQueue()+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
	}
}	
