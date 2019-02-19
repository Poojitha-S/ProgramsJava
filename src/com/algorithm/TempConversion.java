package com.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.util.UtilClass;

public class TempConversion {

	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter the number");
		float temp=sc.nextFloat();
		float[] con=new float[2];
		con=UtilClass.temperaturConversion(temp);
		int ch=0;
		do
		{
				System.out.println("select your choice to convert temprature");
				System.out.println("Press 1 :Fahrenheit to celsius:");
				System.out.println("Press 2 :Celsius to Fahrenheit:");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:System.out.println("Temperature in celsius : "+con[0]);
						break;
	
				case 2:System.out.println("Temperature in fahrenheit : "+con[1]);
					break;
	
				default :System.out.println("Invalid input");
					sc.close();
				}
		}while(ch<3);
	}
	catch(InputMismatchException e)
	{
		System.out.println("Input must be integer");
		System.out.println();
	}
}

}