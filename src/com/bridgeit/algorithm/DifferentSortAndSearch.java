package com.bridgeit.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class DifferentSortAndSearch 
{
	public static void main(String[] args) 
	{
		try
		{
			int ch=0;
			long start=0;
			long end=0;
			Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("Enter ONE to bubble sort:");
				System.out.println("Enter TWO to insertion sort:");
				System.out.println("Enter THREE to binary search");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1 :int ch1=0;
							do
							{
								System.out.println("Enter ONE to integer value of bubble sort:");
								System.out.println("Enter TWO to String value of bubble sort");
								System.out.println("Entre THREE to come out of loop");
								ch1=sc.nextInt();
								switch(ch1)
								{
									case 1: System.out.println("Enter the size of integers to sort:");
											int n=sc.nextInt();
											System.out.println("Enter the array of integers:");
											int[] a=Utility.readArray(n);
											Integer[] a1 = new Integer[a.length];
											int i=0;
											for (int value : a) 
											{
											    a1[i++] = Integer.valueOf(value);
											}
											start=Utility.startTime();
											Utility.genericsBubbleSort(a1);
											end=Utility.endTime();
											for(Integer k:a1)
											{
												System.out.print(k+" ");
											}	
											System.out.println();
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seonds"); 
											break; 
																			
									case 2: System.out.println("Enter String to sort:");
											String str=Utility.readStringArray();
											String[] s1=str.split(" ");
											start=Utility.startTime();
											String[] s2=Utility.genericsBubbleSort(s1);
											end=Utility.endTime();
											for(String s:s2)
											{
												System.out.print(s+" ");
											}
											System.out.println();
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seconds");
											break;  
									}
								
								}while(ch1<3);
							break;
					case 2 :int ch2=0;
							do
							{
								System.out.println("Enter ONE to integer value of insertion sort");
								System.out.println("Enter TWO to String value of insertion sort");
								System.out.println("Entre THREE to come out of loop");
								ch2=sc.nextInt();
								switch(ch2)
								{
									case 1: System.out.println("Enter the size of integers to sort:");
											int n=sc.nextInt();
											System.out.println("Enter the array of integers:");
											int[] a=Utility.readArray(n);
											Integer[] a1 = new Integer[a.length];
											int i=0;
											for (int value : a) 
											{
											    a1[i++] = Integer.valueOf(value);
											}
											start=Utility.startTime();
											Utility.genInsertionSort(a1);
											end=Utility.endTime();
											for(Integer k:a1)
											{
												System.out.print(k+" ");
											}	
											System.out.println();
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seonds"); 
											break; 
																			
									case 2: System.out.println("Enter String to sort:");
											String str=Utility.readStringArray();
											String[] s1=str.split(" ");
											start=Utility.startTime();
											String[] s2=Utility.genInsertionSort(s1);
											end=Utility.endTime();
											for(String s:s2)
											{
												System.out.print(s+" ");
											}
											System.out.println();
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seconds");
											break;  
								}
								}while(ch2<3);
							break;
					case 3 : int ch3=0;
							do
							{
								System.out.println("-----Array should be sorted-----");
								System.out.println("Enter ONE to integer value binary search");
								System.out.println("Enter TWO to String value binary search");
								System.out.println("Entre THREE to come out of loop");
								ch3=sc.nextInt();
								switch(ch3)
								{
									case 1: System.out.println("Enter the size of integer array:");
											int n=sc.nextInt();
											System.out.println("Enter the array of integers:");
											int[] a=Utility.readArray(n);
											Integer[] a1 = new Integer[a.length];
											int i=0;
											for (int value : a) 
											{
											    a1[i++] = Integer.valueOf(value);
											}
											System.out.println("Enter key number to be searched:");
											int key=sc.nextInt();
											start=Utility.startTime();
											int res=Utility.genericBinarySearch(a1, key);
											end=Utility.endTime();
											if(res>0)
												System.out.println("The number "+key+ "is present in the given array of integer");
											else
												System.out.println("The number "+key+ "is not present in the given array of integer");
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seonds"); 
											break; 
																			
									case 2: System.out.println("Enter String to sort:");
											String str=Utility.readStringArray();
											String[] s1=str.split(" ");
											System.out.println("Enter key string to be searched");
											String key1=Utility.readStringArray();
											start=Utility.startTime();
											int res1=Utility.genericBinarySearch(s1, key1);
											end=Utility.endTime();
											if(res1>0)
												System.out.println("The number "+key1+ "is present in the given array of string");
											else
												System.out.println("The number "+key1+ "is not present in the given array of string");
											System.out.println("Elapse time is : "+Utility.elapseTime(start,end)+" nano seconds");
											break;  
									}
							}while(ch3<3);
							break;
				  default : System.out.println("Enter correct option");
				  			System.exit(0);
				  			break;
					}
			}while(ch<4);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be integer");
			System.out.println();
		}
	}
}
	
