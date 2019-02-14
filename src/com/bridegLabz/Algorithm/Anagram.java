package com.bridegLabz.Algorithm;

import java.util.Scanner;

import Util.UtilClass;

public class Anagram 
{
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String one:");
			String a=sc.next();
			System.out.println("Enter String two:");
			String b=sc.next();
			boolean res=UtilClass.checkAnagram(a, b);
			if(res)
				System.out.println("Both "+a+" and "+b+" are anagram");
			else
				System.out.println("Both "+a+" and "+b+" are not anagram");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
