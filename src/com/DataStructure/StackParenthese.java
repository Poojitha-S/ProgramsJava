package com.DataStructure;

import java.util.Scanner;

public class StackParenthese 
{
	public static void main(String[] args) 
	{
		int i=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		System.out.println("Enter Expression:");
		String expr=sc.nextLine();
		while(i<expr.length())
		{
			ch=expr.charAt(i);
			if(ch=='(' || ch==')')
			{
				if(ch=='(' && stack.size<stack.maxSize)
					stack.push(ch);
				else if(ch==')' && !expr.isEmpty())
					stack.pop();
				else if(stack.isFull())
				{
					System.out.println("Stack is full..");
					break;
				}
				else if(stack.isEmpty())
				{
					System.out.println("Stack is empty..");
					break;
				}
			}
			i++;
		}
		if(stack.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
		
	}
}
