package com.bridgeit.algorithm;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgeit.util.Utility;
public class PrimeAnagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the lower limit");
			int start=sc.nextInt();
			System.out.println("Enter the upper limt");
			int end=sc.nextInt();
			
			List<Integer>list=new ArrayList<Integer>();
			list=Utility.prime(start, end);
			
			List<String>l1=new ArrayList<String>();
			System.out.println("Prime numbers between the range "+"("+start+","+end+")"+" are listed below:");
			for(int i:list)
			{
				l1.add(String.valueOf(i));
			}
			System.out.println(l1);
			
			Set<String>set=new HashSet<String>();
			
			System.out.println("the prime numbers that are Anagram Are: ");
			
			set=Utility.PrimeAnagram(l1);
			System.out.println(set);
			
			Set<String> pal=new HashSet<String>();
			System.out.println("The prime numbers which are palindrom");
			
			pal=Utility.PrimePalindrome(l1);
			System.out.println(pal);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
