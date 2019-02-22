package com.datastructure;

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
		String expr=sc.nextLine();//User input
		while(i<expr.length())
		{
			ch=expr.charAt(i);//Taking character each at a time
			if(ch=='{' && stack.size<stack.maxSize)//Not possible to push element
				//if stack size is more than its capacity
				stack.push(ch);
			else if(ch=='}' && !expr.isEmpty())//Not possible to pop element if stack is empty
				stack.pop();
			if(ch=='[' && stack.size<stack.maxSize)
				stack.push(ch);
			else if(ch==']' && !expr.isEmpty())
				stack.pop();
			if(ch=='(' && stack.size<stack.maxSize)
				stack.push(ch);
			else if(ch==')' && !expr.isEmpty())
				stack.pop();			
			i++;
		}
		if(stack.isEmpty())//if any braces left in stack it is not balanced expression
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression id not balanced");
		
	}
}
