package com.datastructure;

import java.util.Scanner;

public class PalindromeChecker<T> 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string for palindrome " );
		s=sc.nextLine();
        char[] c= s.toCharArray();
		DeQueue<Object> m=new DeQueue<Object>(c.length);	
		for(int i=c.length-1;i>=0;i--)
		{
			m.rearEnqueue(c[i]);	
		}
		boolean status=true; 
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=(char) m.frontDequeue())
			{
				status=false;	
				break;
			}
			status=true;
		}
		if(status)
		{
			System.out.println("it is palindrome");
		}
		else
			System.out.println("not a plindrome");
		sc.close();
		}	
}


