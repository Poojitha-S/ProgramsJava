package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.*;

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
			boolean res=Utility.checkAnagram(a, b);
			if(res)
				System.out.println("Both "+a+" and "+b+" are anagram");
			else
				System.out.println("Both "+a+" and "+b+" are not anagram");
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}
}
