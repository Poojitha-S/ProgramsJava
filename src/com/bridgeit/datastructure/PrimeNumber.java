package com.bridgeit.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.util.*;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print prime number:");
		int range=sc.nextInt();
		List<Integer> num=new ArrayList<Integer>();
		num=Utility.prime(0,range);
		Utility.twoDPrime(num);
	}
}
