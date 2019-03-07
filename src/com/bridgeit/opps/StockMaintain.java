package com.bridgeit.oops;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockMaintain 
{
	StockMaintain stockMaintain;
	public static void main(String[] args) throws Exception 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		StockAccount stockAccount = new StockAccount();
		StockMaintain stockMaintain=new StockMaintain();
		do
		{
		System.out.println("1:Add company");
		System.out.println("2.Add user");
		System.out.println("3.Buy Shares");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
			switch(choice)
			{
				case 1: stockAccount.addCompany();
						break;
				case 2: stockAccount.addUser();
						break;
				case 3: stockMaintain.buy();
						break;	
					
			}
		}while(choice!=4);
	}
	String inputUserName;
	String inputSymbol;
	int inputShare;
	public void userInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name ");
		inputUserName=sc.nextLine();
		System.out.println("Enter symbol of company ");
		inputSymbol=sc.nextLine();
		System.out.println("Enter share, you want to buy ");
		inputShare=sc.nextInt();
	}
	public void buy() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name ");
		inputUserName=sc.nextLine();
		System.out.println("Enter symbol of company ");
		inputSymbol=sc.nextLine();
		System.out.println("Enter share, you want to buy ");
		inputShare=sc.nextInt();
		ObjectMapper obj1=new ObjectMapper();
		File file1=new File("/home/admin1/Desktop/JavaPrograms/src/Files/UserAccount.json");
		UserAccountList allUsers=obj1.readValue(file1,UserAccountList.class);
		List<UserAccount> allUser=allUsers.getUserAccount();
		UserAccount userAcc=allUser.stream().filter(usr-> usr.getUserName().equals(inputUserName)).findFirst().get();
		System.out.println(userAcc.getUserName());
	//	UserAccount userUpdated=getUserUpdate(userAcc);
		userAcc.setUserName(inputUserName);
		userAcc.setShare(userAcc.getShare()+inputShare);
		userAcc.setPrice(userAcc.getPrice());
		//allUsers.getUserAccount().add(userAcc);
		obj1.writeValue(file1,userAcc);
	}
	public UserAccount getUserUpdate(UserAccount userAcc)
	{
		//UserAccount userAcc=new UserAccount();
		userAcc.setUserName(inputUserName);
		userAcc.setShare(userAcc.getShare()+inputShare);
		userAcc.setPrice(userAcc.getPrice());
		return userAcc;
	}
	public void showTranscation()
	{
		UserAccount userAccount=new UserAccount();
		Stock stock=new Stock();
		if(stock.getSymbol().equals(inputSymbol))
		{
			System.out.println("User Share = "+userAccount.getShare());
			System.out.println("Company Share = "+stock.getShare());
		}
	}
}
		/*
		 * userAccs=objectMapper.readValue(userFile,UserAccounts.class);
		//Calculating the Share that can be purchased for the amount
		Stock shareList=objectMapper.readValue(companyFile,Stock.class);
		List<Share> shares=shareList.getShares();
		Share shareOfComp=shares.stream().filter(shr->shr.getSymbol().equals(symbol)).findFirst().get();
		double sh=shareOfComp.getPrice();
		
		 //Upating the shares that he bought
		 List<UserAccount> userAccounts=userAccs.getUserAccs();
		 UserAccount userAcc=userAccounts.stream().filter(usr-> usr.getName().equals(name)).findFirst().get();
		 Share share=userAcc.getShares().stream().findFirst().get();
		 share.setShare(share.getShare()+amt);
		 share.setPrice(sh);
		 share.setSymbol(symbol);
		 accDollars=share.getShare()*share.getPrice();
		 save();
		 */
	/*	for(Stock stock:stocks)
		{
			if(stock.getSymbol().equals(inputSymbol))
			{
				if(stock.getShare()>=inputShare)
				{
					stock.setShare(stock.getShare()-inputShare);
					for(UserAccount usr:allUser)
					{
						if(usr.getUserName().equals(inputUserName))
						{
							System.out.println("working");
							UserAccount use=getUserUpdate();
							System.out.println("working");
							allUsers.getUserAccount().add(use);
							System.out.println("working");
							obj1.writeValue(file1,allUsers);
							System.out.println("working");
						}
					}
				}
				else
					System.out.println("Shares not available");
			}
		}*/
	/*	stockMaintain.UserInput();
		Transactions transactions=objectMapper.readValue(transactionFile, Transactions.class);
		//Stack<Transaction> stackTransact=new Stack<Transaction>();
		Stock stock=objectMapper.readValue(companyFile, Stock.class);
		StockAccount stockAcc=new StockAccount("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/useraccount.json");
		List<Share> shrs=stock.getShares();                                    
		// to get the chare object from company pojo
		Share shr=shrs.stream().filter(shar->shar.getSymbol().equals(inputSymbolName)).findFirst().get();
		if (shr.getSymbol().equals(inputSymbolName)) */
		/*{

			if (shr.getShare()>=inputAmount) 
			{
				shr.setShare(shr.getShare()-inputAmount);// Upatading the company Share
				stockAcc.buy(inputUserName,inputAmount,inputSymbolName);

				Transaction transaction=new Transaction();
				List<BuyTransact> buyTransactionList=transactions.getBuyTransacts();
				transaction.setUserName(inputUserName);
				transaction.setShare(inputAmount);
				transaction.setSymbol(inputSymbolName);

				BuyTransact buyTransacts=new BuyTransact();
				buyTransacts.setTransaction(transaction);
				buyTransactionList.add(buyTransacts);

				transactions.setBuyTransacts(buyTransactionList);
				objectMapper.writeValue(/*"/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/jsonTransaction.json")transactionFile, transactions);*/
			//}
//		} else? //
		/*{
			System.out.println("Share not Available");
		}

		objectMapper.writeValue(companyFile,stock);

	}*/

