package com.bridgeit.datastructure;

import java.util.Scanner;

public class PalindromeChecker<T> 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for palindrome " );
		String s=sc.nextLine();
        char[] c= s.toCharArray();
		DeQueue<Object> queue=new DeQueue<Object>(c.length);	
		for(int i=0;i<c.length;i++)
		{
			queue.rearEnqueue(c[i]);	
		}
		boolean status=true; 
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=(char) queue.rearDequeue())
			{
				status=false;	
				break;
			}
			status=true;
		}
		if(status)
		{
			System.out.println(s+" is palindrome");
		}
		else
			System.out.println(s+" not a plindrome");
		sc.close();
	}
}


