package com.bridgeLabz.functional;

import java.util.Scanner;

import Util.UtilClass;

public class StringReplace 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String str1="Hello user name, how are you";
			String str2="";
			do{
				System.out.println("Enter user name");
				str2=sc.next();
			}while(str2.length()<3);
			System.out.println(UtilClass.stringReplace(str1, str2));
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


