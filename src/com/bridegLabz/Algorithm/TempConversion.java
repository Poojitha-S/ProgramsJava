package com.bridegLabz.Algorithm;

import java.util.Scanner;
import Util.UtilClass;

public class TempConversion {

	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	try
	{
		String input1;
		do
		{
			System.out.println("Enter the number");
			input1=sc.next();
		}while(!UtilClass.isNumeric(input1));
		float temp=Float.parseFloat(input1);
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
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}