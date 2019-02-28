
package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.exception.InSufficientFundException;

public class BankCashCounter
{
	public static void main(String[] args) throws InSufficientFundException 
	{
		Scanner sc  = new Scanner(System.in);
		int amount,balance;
		Account a=new Account();
		System.out.println("-----------------WELCOME TO BANK---------------------");
		System.out.println("----Enter the number of people standing in queue-----");	
		int n= sc.nextInt();
		MyQueue<String> queue=new MyQueue<String>();	
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the name of "+i +" person");
			String name= sc.next();
			queue.enQueue(name); 	
		}
		System.out.println("\n"+"----People standing in queue are as follows-----");
		//System.out.println(queue);
		//String[] name1=queue.toString().split(", ");
		for(int i=1;i<=n;i++)
		{
			//String res=name1[i].replaceAll("[^\\w]", " ");
		//	System.out.println("Welcome: Ms/Mrs."+res);
			System.out.println("Welcome....person "+i+" in Queue");
			System.out.println("--------Please choose your options:-------------");
			System.out.println("Press 1:To Deposit");
			System.out.println("Press 2:To Withdraw");
			int ch =sc.nextInt();
			switch(ch)
			{
			case 1: try
					{
						System.out.println("Amount should not be less than or equal to zero.....");
						System.out.println("Eneter amount"); 
						amount=sc.nextInt();
						balance=a.deposit(amount);
						System.out.println("New balance is: "+balance);
					}
					catch(InSufficientFundException e)
					{
						System.out.println(e.getMessage());
					}
					break;

			case 2: try
					{ 
						System.out.println("Amount should not be less than amount in account.....");
						System.out.println("Eneter amount"); 
						amount=sc.nextInt();
						balance= a.withdraw(amount);
						System.out.println("New balance is: "+balance);
					}
					catch(InSufficientFundException e)
					{
						System.out.println(e.getMessage());
					}
					break;
			}
			queue.deQueue();		
		}
	}
}
