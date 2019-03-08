package com.bridgeit.datastructure;

import java.util.Scanner;
interface Sample
{
	void print();
	
}

public class StackParenthese 
{
	public static void main(String[] args) 
	{
		int i=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		MyStack<Character> stack=new MyStack<>();
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
		Sample s=()->{System.out.println("If there is  starting bracket left in stack then that expression is not balanced");};
		s.print();
		if(stack.isEmpty())
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression id not balanced");
		sc.close();
	}
}
