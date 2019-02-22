package com.datastructure;

import com.util.UtilClass;

public class Calender
{
	public static void main(String[] args) 
	{
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		//Array of months
		String[] Month={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		//Array of number of days in every month
		int[] noOfDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
		//Gives index of week
		int res=UtilClass.dayOfWeek(1, month, year);
		System.out.println("   "+Month[month]+" "+year);
		if(month==2 && UtilClass.leap(year))
			noOfDays[2]=29;
		System.out.println("S "+" M "+" T "+" W "+" T "+" F "+" S");
		
		for(int i=0;i<res;i++)
			System.out.print("   ");//Leaves spaces
		
		for(int i=1;i<=noOfDays[month];i++)
		{
			if(UtilClass.getDigits(i)==1)//For single digit date, left 3 space
				System.out.print(i+"  ");
			else//for double digit date, left 3 space
				System.out.print(i+" ");
			//To go next line
			if((res+i)%7==0)//7%7==0 means take next line
				System.out.println();
		}
	}
}
