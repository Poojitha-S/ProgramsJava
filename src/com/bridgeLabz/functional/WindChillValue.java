package com.bridgeLabz.functional;

import java.util.Scanner;

public class WindChillValue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double temp=Double.parseDouble(args[0]);
		double speed=Double.parseDouble(args[1]);
		long res=com.Util.functional.UtilClass.windChill(temp, speed);
		if(res==0.0)
			System.out.println("Invalid input");
		else
			System.out.println("Wind chill value is: "+res);

	}

}
