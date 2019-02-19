package com.algorithm;

import java.util.Scanner;

import com.util.*;

public class Anagram 
{
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String one:");
			String a=sc.nextLine();
			System.out.println("Enter String two:");
			String b=sc.nextLine();
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
