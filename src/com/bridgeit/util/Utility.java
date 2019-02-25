package com.bridgeit.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Random;
/**
 * @author admin1
 *
 */
public class Utility
{

	/**********************************String Replace******************************/
	
	/**
	 * This method replace the specified string with another string using replace() method.
	 * @param s1
	 * @param s2
	 * @return modified string
	 */
	public static String stringReplace(String s1,String s2)
	{
		return s1.replace("user name", s2);//replaces string1 with string2
	}
	/**
	 * This method determines entered year leap or not
	 * The year should divisible by 4;
	 * If the year can be evenly divided by 100, it is NOT a leap year, unless;
	 * The year is also evenly divisible by 400. Then it is a leap year.
	 * @param year
	 * @return true if leap year else return false
	 */
	public static boolean leap(int year)
	{

		/*
		 * century can be a leap year unless it is divisible by 400
		 * 1700%4=0(425),1900 but not by 400
		 */
		if((year%400==0) || (year%4==0 && year%100!=0))
			return true;
		return false;
	}
	/*********************************Flip Coin*********************************/
	/**
	 * This method uses Math.random() and generates random numbers to find no of heads 
	 * and no of tails present in a given flips range 
	 * @param flips
	 * @return number of tails
	 */
	public static double countOfHead(int flips)
	{
		int tails=0;
		for(int i=0;i<flips;i++)
		{	//Math.random to generate random numbers
			if(Math.random() <= 0.5)
				tails++;
		}
		return tails;
	}
	/********************************Power of 2************************************/	
	/**
	 * This method prints table of power of 2 till whatever range specified by user
	 * range should be less then 31 (0<=N<31)
	 * @param n
	 * @return array of power of two
	 */
	public static int[] powerOfTwo(int n)
	{
         int power = 1;
         int[] temp=new int[n+1];
         //Looping over n times
         for(int i=0;i<=n;i++)
         {
             power = power * 2;//formula for calculation of power of 2
             temp[i]=power;
         }
         return temp;
   	}
	/*********************************Hormonic Number*****************************/
	
	/**
	 * This method returns hormonic number of specified number by user.
	 * @param num
	 * @return hormonic sum
	 */
	public static double hormonicSum(int num)
	{
		double sum=1;
		for(int i=1;i<num;i++)
		{
			sum=sum+(double)1/i;//Sum of nth hormonic number
		}
		return sum;
	}
	/**********************************Prime Factor***********************************/
	
	/**
	 * Which determines the prime factor of given number
	 * Example:Prime factor of 12 is 2*2*3
	 * @param n
	 * @return list of integers
	 */
	public static List<Integer> primeFactors(int n) 
	{ 	
		List<Integer> fact = new ArrayList<>();  
		//for even numbers
		while(n%2==0) 
		{ 
			fact.add(2);
			n/=2; 
		} 
		//for odd numbers
		for(int i=3;i*i<=n;i++) 
		{ 
			while(n%i==0) 
			{ 
				fact.add(i);
				n/=i; 
			} 
		} 
		/*
		 * if n is a prime number and is greater than 2, 
		 * then n will not become 1 by above two steps
		 */
		if(n>2) 
			fact.add(n);
    return fact;

	}
	/********************************Gambler*********************************/
	
	/**
	 *This method shows the simulation of gambling game using stake,
	 *goal and no of games as factors.
	 * @param stake
	 * @param goal
	 * @param games
	 * @return number of wins
	 */
	public static double gambler(int stake,int goal,int games)
	{
		double win=0; //Total number game wins
		double n;
		while(games!=0) 
		{
			n= Math.random();
			if(n>0.5) //He/she wins that particular bet
			{
				win++;
			}
			games--;
		}
		return win;
	}
	/********************************Coupon Number******************************/
	/**
	 * This method checks generated random coupon numbers are distinct or not
	 * @param coupon
	 * @return distinct coupon number
	 */
	public static Set<String> distinctCoupon(int coupon)
	{
		Set<String> s=new HashSet<>();
		while(coupon!=0)
		{
			Random num =new Random();
			//generates integer random number with field width of 4
			String ran=String.format("%04d",num.nextInt(10000));
			s.add(ran);//HashSet does not allows duplicates coupons
			coupon--;
		}
		return s;
	}
	/******************************2D Arrays**************************/
	
	/**
	 * These two read2D() and display2d() generates and prints the two dimensional array
	 * @param a
	 * @param row
	 * @param col
	 * @return 2D array
	 */
	public static int[][] read2D(int[][] a,int row, int col) 
	{
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();//Accept array elements
			}
		}
		return a;
	}
	/*********************************Sum of triplets*******************************/
	
	/**
	 * This method reads array of elements and determines numbers those sum is equal 
	 * to zero of triplets
	 * @param b
	 * @param length
	 * @return count of triplets sum is zero 
	 */
	public static int triplets(int[] b, int length)
	{
		int i,j,k,count =0;
		System.out.println("Triplets whose sum is zero");
		for(i = 0 ;i<length-2;i++ )
		{
			for(j=i+1;j<length-1;j++)
			{
				for(k=j+1;k<length;k++)
				{
					if(b[i]+b[j]+b[k]==0)
					{						
						System.out.println(b[i]+" "+b[j]+" "+b[k]);
						count++;//count number of triplets
					}
				}
			}
		}
		return count;
	} 

	/*******************************Euclidean Distance***************************************/
	
	/**
	 * this method determines distance between two points on a st. line using below formula.
	 * Formula:distance = sqrt(x*x + y*y). 
	 * @param x
	 * @param y
	 * @return euclidean distance
	 */
	public static double euclideanDistance(double x , double y)
	{
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));//sqrt(x*x + y*y). 
		return distance;
	}
	
	/******************************Stop Watch*******************************/
	/**
	 *
	 * This method simulate stop watch program by using current time of system
	 *  with System.nanoTime() in nano seconds between end and starting of click.
	 * @return
	 */
	public static long startTime()
	{		
			return System.nanoTime();//Returns the current value of the running JVM's
			//in nanoseconds.
	}
	public static long endTime()
	{
			return System.nanoTime();
	}
	public static long elapseTime(long start,long end)
	{
		return (end-start);
	}
	/***************************Quadratic Equation**************************/
	/**
	 * This method gives the roots of quadratic equation of user inputs a, b and c using formulae.
	 * delta = b*b - 4*a*c
	 * Root 1 of x = (-b + sqrt(delta))/(2*a)
	 * Root 2 of x = (-b - sqrt(delta))/(2*a)
	 * @param a
	 * @param b
	 * @param c
	 * @return delta value of quadratic equation
	 */
	public static  double quadraticDetla(double a,double b,double c)
	{
		double delta=(b*b)-(4*a*c);
		return delta;
	}
	/*****************************Wind Chill*******************************/
	
	/**
	 *  This method determines the wind chill for Given the temperature t
	 * (in Fahrenheit) and the wind speed v (in miles per hour) by user.
	 * * @param temp
	 * @param speed
	 * @return wind chill value
	 */
	public static long windChill(double temp, double speed)
	{
		if(temp>50 || (speed<3 || speed>120))//input validation
		{
			return 0;
		}
		else
		{
			//Formula to find wind chill
			return (long) (35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(speed, 0.16));
		}
	}
	/**************************Anagram Of String*******************/
	/**
	 * This method checks give strings are anagram
	 * One string is an anagram of another if the second is simply a 
	 * rearrangement of the first. 
	 * For example, 'heart' and 'earth' are anagrams.
	 * @param str1
	 * @param str2
	 * @return boolean value 
	 */
	public static  boolean checkAnagram(String str1, String str2)
	{
		//Converting both string to character array of lower case to compare
		char[] str1Chars=str1.toLowerCase().toCharArray();
		char[] str2Chars=str2.toLowerCase().toCharArray();
		//Sorting both arrays to make them easy to compare
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		str1=new String(str1Chars);
		str2=new String(str2Chars);
		//Returns true if both strings are equal
		return str1.equals(str2);
	}
	/*****************************Prime Number of range between 0 and 1000**************/
	
	/**
	 * This method returns the array of prime number present between given range
	 * @param low
	 * @param up
	 * @return list of prime numbers
	 */
	public static List<Integer> prime(int low,int up)
	{
		List<Integer> list=new ArrayList<>();
		int flag=0;
		for(int i=low;i<=up;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)//Prime numbers not divide by any numbers other than 1 and itself 
				{
					flag=0;//If divide by other number it is not a prime number
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag ==1)
			{
				list.add(i);//Adding only prime numbers to list
			}
		}
		return list;
	}
	/**************************Prime Anagram*************************/
	
	/**
	 * This method checks gives prime numbers are anagram
	 * One prime number is an anagram of another if the second is simply a 
	 * rearrangement of the first.
	 * @param li
	 * @return set of prime anagrams
	 */
	public static Set<String> PrimeAnagram(List<String> li)
	{
		Set<String>set=new HashSet<String>();
		for(int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(checkAnagram(li.get(i), li.get(j)))//checking numbers are not
				{
					set.add(li.get(i));//adding to list
					set.add(li.get(j));
				}
			}
		}
		return set;
	}
	/*********************Prime Number Palindrome**********************/
	/**
	 * This method checks gives prime numbers are anagram
	 * @param list
	 * @return set of prime palindromes
	 */
	public static Set<String> PrimePalindrome(List<String>list)
	{
		Set<String> pal=new HashSet<String>();
		java.util.Iterator<String> it= list.iterator();//Traverse through set
		while(it.hasNext())
		{
			//reversing of string
			String str=it.next();
			String rev="";
			int len=str.length();
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			//checking palindrome or not
			if(str.equals(rev))
				pal.add(str);	
		}
		return pal;

	}	
	public static  List<Integer> checkPrimeAnagram(List<Integer> num)
	{
		List<Integer> li=new ArrayList<>();
		int[] a=new int[num.size()];
		for(int i=0;i<a.length;i++)
			a[i]=(int) num.get(i);//Copying list elements to integer array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>0 && a[j]>0 && a[i]!=a[j])
				{
					String s1=Integer.toString(a[i]);
					String s2=Integer.toString(a[j]);
					char[] c1=s1.toCharArray();//converting string to char array
					char[] c2=s2.toCharArray();
					Arrays.sort(c1);//sorting
					Arrays.sort(c2);
					if(Arrays.equals(c1,c2))
						li.add(a[i]);
				}
			}
		}
		return li;
	}
	/************************Generic searching and sorting*****************/
	/************************Binary Search*************************/
	
	/**
	 * Searches the sorted array by repeatedly dividing the search interval in half.
	 * @param num1
	 * @param key
	 * @return position of searched element
	 */
	public static  <T extends Comparable<T>> int genericBinarySearch(T[] num1,T key)
	{
		T[] num=Utility.genInsertionSort(num1);
		int low = 0;
		int high = num.length -1;
		// Returns index of key if it is present in array else return -1 
		while(low<=high)
		{
			int mid=((low + high) / 2);
			// If element is smaller than mid, then it can only be present in left subarray 
			if(key.compareTo(num[mid])<0)
			{
				high=mid-1;
			}
		  // If element is larger than mid, then it can only be present in right subarray 
			else if(key.compareTo(num[mid])>0)
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	/*****************************Insertion Sort**************************/
	
	/**
	 * Insertion sort is a simple sorting algorithm that works the way 
	 * we sort playing cards in our hands.
	 * @param array
	 * @return array of sorted elements
	 */
	public static <T extends Comparable<T>> T[] genInsertionSort(T[] array)
	{	
		for(int i=1;i<array.length;i++)
		{
			/* 
			  * Move elements of array, that are greater than key, 
			  * to one position ahead of their current position 
			  */
		
			for(int j=i;j>0;j--)
			{
				//Putting element to proper position
				if(array[j-1].compareTo(array[j])>0)
				{
					//swapping
					T temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;                        
	}
	/*********************************Bubble sort**************************/
	
	/**
	 * Bubble Sort is the simplest sorting algorithm that 
	 * works by repeatedly swapping the adjacent elements
	 * if they are in wrong order.
	 * @param array
	 * @return array of sorted elements
	 */
	public static <T extends Comparable<T>> T[] genericsBubbleSort(T[] array)
	{

		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)//comparing adjecent element
				{//swapping
					T temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}return array;

	}
	/***********************Merge Sort**************************/
	/**
	 * Merge Sort is a Divide and Conquer algorithm. It divides
	 * input array in two halves, calls itself for the two halves 
	 * and then merges the two sorted halves.
	 * In this method strings are sorted.
	 * @param arr
	 * @param l
	 * @param r
	 */
	public static void sort(String arr[], int l, int r) 
	{ 
	    if (l < r) 
	    { 
	       // determine the middle point 
	       int m=(l+r)/2; 
	      // divide the left halves array into individual elements 
	       sort(arr,l,m); 
	       // divide the right halves array into individual elements  
	       sort(arr,m+1,r); 
	       //merge the divided array in sorted manner
	       merge(arr,l,m,r); 
	     } 
	 }
	public static void merge(String arr[], int l, int m, int r) 
    { 	
		int i=0,j=0; 
		int k=l; 
        int n1=m-l+1;//size of first array 
        int n2=r-m; //size of second array
         //temp arrays 
        String L[]=new String[n1]; 
        String R[]=new String [n2]; 
        //Copy data to temp arrays
        for(int i1=0;i1<n1;i1++) 
            L[i1]=arr[l+i1]; 
        for(int j1=0;j1<n2;j1++) 
            R[j1]=arr[m+1+j1]; 
        // Merge the temp arrays
        while(i<n1 && j<n2) 
        { 
            if(L[i].compareTo(R[j])<=0) 
            { 
                arr[k]=L[i]; 
                i++; 
            } 
            else
            { 
                arr[k]=R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        //Copy remaining elements of L[] if any 
        while(i<n1) 
        { 
            arr[k]=L[i]; 
            i++; 
            k++; 
        } 
  
        //Copy remaining elements of R[] if any 
        while(j<n2) 
        { 
            arr[k]=R[j]; 
            j++; 
            k++; 
        } 
    }
	/*************************Binary Search word from word list*****************/
	
	/**
	 * Read in a list of words from File. Then prompt the user to enter a word to search the list.
	 * The program reports if the search word is found in the list.
	 * Print the result if the word is found or not
	 * @param path
	 * @param word
	 * @return position of searched element
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	public static int wordSerach(String path,String word) throws IOException, IllegalAccessException
	{
		int res=0;
		BufferedReader br=null;
		try{
				br=new BufferedReader(new FileReader(path));
				String line="";
				String str="";
				while((str=br.readLine())!=null)//reaing from file
				{//storing in words in varialbe line
					line=line+str;
				}
				String[] words=line.split(" ");//array of words
				Arrays.sort(words);//sorting of words
				System.out.println("Sorted file:");
				for(String s: words)
				{
					System.out.print(s+" ");//Displaying
				}
				System.out.println();
				System.out.println();
				
			 res=Utility.genericBinarySearch(words, word);//searching of key

			}catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
				{
					try{
						br.close();//closing file
					}catch(IOException e)
					{
							e.printStackTrace();
					}
				}
			}
		return res;
	}
	/****************************Vending Machine*************************/
	
	/**
	 * calculate the minimum number of Notes as well as the Notes to be 
	 * returned by the Vending Machine as a Change.As output one the number
	 * of minimum Note needed to give the change and second list of Rs Notes
	 * that would given in the Change.
	 * @param rup
	 * @param notes
	 * @return array of number of notes
	 */
	public static int[] vendingMachine (int rup,int[] notes)
	{	
		int total;
		int[] temp=new int[notes.length];
		for(int i=0;i<notes.length;i++ )
		{
			total=rup/notes[i];// total num of notes 
			if(total>0)// notes present or not
			{
				//System.out.println(notes[i]+" : "+total);
				temp[i]=total;
			}
			rup=rup%notes[i];//Gives number of particular notes 
		}
		
	return temp;
	}
	/*******************************Day Of Week*****************************/
	/**
	 * static function that takes a date as input and prints the day of the week
	 * that date falls on using following formulas, for the Gregorian calendar.
	 * @param d
	 * @param m
	 * @param y
	 * @return int value of day
	 */
	public static int dayOfWeek(int d, int m, int y) 
	{	//formulae to claculate day
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		return d0;
	}	
	/************************Temp Conversion****************************/
	/**
	 * This static method given the temperature in fahrenheit as input outputs 
	 * the temperature in Celsius or viceversa
	 * @param temp
	 * @return array of temperature
	 */
	public static float[] temperaturConversion(float temp)
	{
		float[] con=new float[2];
		con[0]=((temp-32)*5)/9;
		con[1]=(temp*9/5+32);
		return con;
	}
	/***********************Mothly Payment**********************/
	/**
	 * This method reads three command-line arguments P, Y, and R 
	 * and calculates the monthly payments you would have to make 
	 * over Y years to pay off a P principal loan amount at R 
	 * percent interest compounded monthly.
	 * @param P
	 * @param Y
	 * @param R
	 * @return monthly pay
	 */
	public static double monthlyPayment( int P , int Y , double R ) 
	{
		int  termsInMonth=(12*Y);
		double monthlyRate=R/(12*100);
		double power = Math.pow((1+ monthlyRate ),-termsInMonth);
		double	monthlyPay =((P*termsInMonth)/(1-power));
		return monthlyPay;
	}
	/*******************************NewtonSqrt***************************/
	/**
	 * This method computes the square root of a nonnegative number c
	 * given in the input using Newton's method
	 * @param c
	 * @return square root
	 */
	public static double sqrtNewtons(double c)
	{
		double epsilon=1e-15;
		double t=c;			
		while(Math.abs(t-c/t) >epsilon*t)
		{
			t=(c/t+t)/2.0;//x=1/2(x+b/x)
		}
		return t;
	}
	/********************************* Binary********************************/
	/**
	 * This method outputs the binary (base 2) representation of the decimal number
	 * typed as the input.
	 * @param decimal
	 * @return binary value of decimal
	 */
	public static String toBinary(int decimal)
	{
		String binary= "";
		String s2 ="";
		String s3="";
		int digits=Utility.getDigits(decimal);
		int zero=digits*4;
		while(decimal>=1)
		{
			int res=decimal%2;//Gives binary digits
			binary=binary+res;//binary digits store in variable binary
			decimal = decimal/2;//continous dividing number by 2 till reaches 1
		}
		for(int i=0;i<zero;i++)//adding zeroes to empty space to represent 4 - bit
		{
			s3+="0";
		}
		s2=s3.substring(0, zero-binary.length());//gives number of zeros to be added to binary 
		for(int i = binary.length()-1;i>=0;i--)
		{
			s2 += binary.charAt(i);//adding zeroes to binary number
		}
		return s2;		
	}
	/******************************Nibble Swapping*********************************/
	/**
	 * This method swap the nibbles of binary number and gives equivalent decimal number.
	 * @param Number
	 * @return swapped nibbles
	 */
	public static int swapNibbles(int Number)
	{
		String binary=toBinary(Number);//converting to binary
		String swapnib=Utility.swapNib(binary);//swapping of nibbles
		Integer i=new Integer(swapnib);//boxing
		return Integer.valueOf(i);//unboxing
	}
	public static String swapNib(String s)
	{
		//swapping
		char[] c=s.toCharArray();
		for(int i=0;i<s.length()/2-1;i++)
		{
			char t=c[i];
			c[i] =c[c.length-1-i];
			c[c.length-1-i]=t;
		}
		s=new String(c);//storing chars as string
		return s;
	}
	/********************TO Decimal****************/
	/**
	 * @param binaryNumber
	 * @return decimal value of binary number
	 */
	public static int toDecimal(int binaryNumber)
	{
		 int decimal = 0;
		    int b = 0;
		    while(true)
		    {
		      if(binaryNumber == 0)
		      		break;
		       else
		       {//converting binary to decimal
		          int temp = binaryNumber%10;
		          decimal += temp*Math.pow(2, b);
		          binaryNumber = binaryNumber/10;
		          b++;
		       }
		    }
		    return decimal;
	}
	/******************************** Is Prime***********************/
	/**
	 * Checks given number is power of two
	 * @param num
	 * @return true if power of two
	 */
	public static boolean isPowerTwo(int num)
	{
		if(num==0) 
			return false; 

		while(num!=1) 
		{ 
			if (num%2!=0) //if num is not divisible by 2 it is not a power of two
				return false; 
			num=num/2; 
		} 
		return true; 
	}
	/*************************Read String***************************/
	/**
	 * @return string
	 */
	public static String readStringArray()
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();//reading user input
		return a;
	}
	/*************************Read Integer Array***************************/
	/**
	 * @param n
	 * @return array of elements
	 */
	public static int[] readArray(int n)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[n];
		for(int i=0;i<n;i++)//Looping over array
			a[i]=sc.nextInt();//reading user input
		return a;
	
	}
	/************************Print Array***************************/
	/**
	 * @param arr
	 */
	public static void printArray(String arr[]) 
	{ 
	    int n = arr.length; 
	    for (int i=0; i<n; ++i)//Looping over array 
	        System.out.print(arr[i] + " "); 
	    System.out.println(); 
	} 
	
	/********************Get Digits*************************/
	/**
	 * @param num
	 * @return number of digits
	 */
	public static int getDigits(int num)
	{
		int count=0;
	    while(num!=0)
	    {
	       num/=10;//Getting each ele in one iteration
	       ++count;
	    }
		return count;
	}
	/*********************String Array To Integer Array**************/
	/**
	 * @param str
	 * @return array of integer
	 */
	public static int[] stringToIntArray(String[] str )
	{
		int[] arr=new int[str.length];//Creating int array
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);//converting string to int
		return arr;
	}
	/**********************Read From File***********************/
	/**
	 * @param file
	 * @return array of string
	 */
	public static String[] readFromFile(File file) 
	{
		String[] word = null;
		String line="";
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{
			String temp="";
			while((line=br.readLine())!=null)//Reading all line until reach EOF
			{
				temp+=line;
			}
			word=temp.split(" ");//Geeting each words
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return word;
	}
	/**
	 * @param list
	 * @param file
	 */
	public static void writeToFile(int[] list,File file) throws IOException
	{
		if(list==null && list.length==0)
			return;
		try(BufferedWriter w=new BufferedWriter(new FileWriter(file)))
		{
			for(int i=0;i<list.length;i++)
				w.write(list[i]+" ");//writing on specified file
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	/**********************Printing 2D-array********************************/
	public static void twoDPrime(List<Integer> num)
	{
		int row=10,col=27;
		int[][] arr=new int[row][col];
		List<Integer> li=new ArrayList<>(num);
		int temp=100,k=0;
		//Reading prime numbers as 2D array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
					if(k<li.size() && li.get(k)<=temp)//checks num is less than 100 
					{
						arr[i][j]=li.get(k);//store num in 2D array
						System.out.print(arr[i][j]+"\t");
						k++;
					}
				
			}
			System.out.println();
			temp=temp+100;
		}
	}
	/******************************Factorial Of a Number********************/
	/**
	 * @param n
	 * @return factorial of n
	 */
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;//calculating factorial 
		}
		return fact;
	}
}