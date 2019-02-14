package com.bridegLabz.Algorithm;

import java.util.Scanner;
import Util.UtilClass;
public class SecreateNumber 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		try
		{
			String input;
			do
			{
				input=args[0];
			}while(!UtilClass.isNumeric(input));
			
			int n=Integer.parseInt(input);
			int N=(int) Math.pow(2, n)-1;
			UtilClass.secretNumber(N);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
