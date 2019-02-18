package com.algorithm;

import java.util.Scanner;

import com.util.UtilClass;
public class SecreateNumber 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		try
		{
			int n=Integer.parseInt(args[0]);
			int N=(int) Math.pow(2, n)-1;
			UtilClass.secretNumber(N);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
