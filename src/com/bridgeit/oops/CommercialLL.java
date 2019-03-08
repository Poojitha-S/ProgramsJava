package com.bridgeit.oops;

import java.util.Scanner;

public class CommercialLL
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		CommercialLLMethods stock = new CommercialLLMethods();
		char ch;
		System.out.println("****Welcome to Stock Market****");
		do
		{
			System.out.println("Enter What you wants to do\n1. Add Details\t2. Buy\t3. Sell\t4. Print Report ");
			int choice = utility.inputInteger();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					stock.linkedlist();
					break;
				case 3:
					stock.sellStock();
					stock.linkedlist();
					break;
				case 4 : 
					stock.printReport();
					break;							
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}
