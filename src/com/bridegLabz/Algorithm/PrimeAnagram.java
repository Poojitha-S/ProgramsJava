package com.bridegLabz.Algorithm;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.Util.functional.*;

import Util.UtilClass;



public class PrimeAnagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String input1;
			do
			{
				System.out.println("Enter the lower limit");
				input1=sc.next();
			}while(!UtilClass.isNumeric(input1));
			int start=Integer.parseInt(input1);
			String input2;
			do
			{
				System.out.println("Enter the upper limt");
				input2=sc.next();
			}while(!UtilClass.isNumeric(input2));

			int end=Integer.parseInt(input2);
			
			List<Integer>list=new ArrayList<Integer>();
			list=UtilClass.isPrime(start, end);
			
			List<String>l1=new ArrayList<String>();
			System.out.println("Prime numbers between the range "+"("+start+","+end+")"+" are listed below:");
			for(int i:list)
			{
				l1.add(String.valueOf(i));
			}
			System.out.println(l1);
			
			Set<String>set=new HashSet<String>();
			
			System.out.println("the prime numbers that are Anagram Are: ");
			
			set=UtilClass.PrimeAnogram(l1);
			System.out.println(set);
			
			Set<String> pal_set=new HashSet<String>();
			System.out.println("The prime numbers which are palindrom");
			
			pal_set=UtilClass.PrimePalindrome(l1);
			System.out.println(pal_set);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
