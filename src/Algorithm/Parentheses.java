package Algorithm;
import java.util.Scanner;

import com.Util.functional.*;

import Util.Stack;

public class Parentheses 
{
	public static void main(String[] args) 
	{
			Scanner sc1=new Scanner(System.in);
			Stack<Character> expStack =new Stack<>();
			String expression;
			do 
			{
				System.out.println("Enter an arithmetic expression");
				expression=sc1.next();
			}while(expression.equals("")||expression==null);

			
			char ch;
			int index=0;
			while(index<expression.length())
			{
				ch=expression.charAt(index);
				if(ch=='('||ch==')')
				{
					if(ch=='('&& expStack.size()<expStack.getStackCapacity()) 
						expStack.push(ch);
					else if(ch==')'&&!expStack.isEmpty())  
					{
						expStack.pop();
					}
					else if(expStack.isFull())
					{
						System.out.println("Stack is full..");
						break;
					}
					else if(expStack.isEmpty())
					{
						System.out.println("Stack is empty..");
						break;
					}
				}
				index++;
			
			}
			
			//check stack still it contains items or not
			if(expStack.isEmpty())
				System.out.println("Given expression is balanced...!");
			else
			{
				System.out.println("Given expression is not balanced...!");
			}
			sc1.close();

	}

}