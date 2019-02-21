package com.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.util.*;

public class PrimeAnagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print prime number:");
		int range=sc.nextInt();
		List<Integer> num=new ArrayList<Integer>();
		num=UtilClass.prime(0,range);
		List<Integer> li=new ArrayList<Integer>();
		li=UtilClass.checkPrimeAnagram(num);
		UtilClass.twoDPrime(li);

	}
}
