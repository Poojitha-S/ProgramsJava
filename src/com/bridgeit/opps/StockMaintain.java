package com.bridgeit.opps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;



public class StockMaintain 
{
	static ObjectMapper objectMapper=new ObjectMapper();
	static File companyFile=new File("/home/admin1/Desktop/Files/JSON/jsonCompanyShare.json");
	static File userFile=new File("/home/admin1/Desktop/Files/JSON/useraccount.json");
	static File transactionFile=new File("/home/admin1/Desktop/Files/JSON/jsonTransaction.json");
	
	static Scanner int_input=new Scanner(System.in);
	static Scanner String_input=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		int choice=display();
		outer: while(choice <= 6)
		{

			switch (choice)
			{
			case 1:
				createCompany();
				break;
			case 2:
				createUserAccount();
				break;
			case 3:
				ViewCompanyList();
				break;
			case 4:
				buyCompany();
				break;
			case 5:
				SellShare();
				break;
			case 6:
				removeCompany(companyFile);
				break;

			default:
				System.out.println("The End ");
				break outer;
			}
			choice=display();
		}

	}

	

	// To display to user
	public static int display() 
	{
		System.out.println("If you want to create company Account press 1 ");
		System.out.println("If you want to create User Account press 2");
		System.out.println("To view the company n price press 3");
		System.out.println("To Buy Share press 4");
		System.out.println("To Sell Share press 5");
		System.out.println("To remove the company press 6");
		System.out.println("Other than above numbers press any number");
		System.out.println();
		System.out.println("Enter your choice ");
		int choice = int_input.nextInt();
		return choice;
	}

	// To take user inputs
	static String inputUserName;
	static String inputSymbolName;
	static int inputAmount;

	public static void UserInput() 
	{
		System.out.println("Enter User Name ");
		inputUserName=String_input.next();
		System.out.println("Enter the Symbol of Company u want ");
		inputSymbolName=String_input.next();
		System.out.println("Enter the share of Company u want to buy ");
		inputAmount=int_input.nextInt();
	}

	// to buy the shares from the company
	public static void buyCompany() throws Exception
	{
		UserInput();
		Transactions transactions=objectMapper.readValue(transactionFile, Transactions.class);
		//Stack<Transaction> stackTransact=new Stack<Transaction>();
		Stock stock=objectMapper.readValue(companyFile, Stock.class);
		StockAccount stockAcc=new StockAccount("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/useraccount.json");
		List<Share> shrs=stock.getShares();                                    
		// to get the chare object from company pojo
		Share shr=shrs.stream().filter(shar->shar.getSymbol().equals(inputSymbolName)).findFirst().get();
		if (shr.getSymbol().equals(inputSymbolName)) 
		{

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
				objectMapper.writeValue(/*"/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/jsonTransaction.json")*/transactionFile, transactions);
			}
		} else
		{
			System.out.println("Share not Available");
		}

		objectMapper.writeValue(companyFile,stock);

	}

	// to sell the shares to the company
	public static void SellShare() throws Exception
	{
		UserInput();
		Transactions transactions=objectMapper.readValue(transactionFile, Transactions.class);
		Stock stock=objectMapper.readValue(companyFile, Stock.class);
		StockAccount stockAcc=new StockAccount("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/useraccount.json");
		List<Share> shrs=stock.getShares();
		// to get the chare object from company pojo
		Share shr=shrs.stream().filter(shar->shar.getSymbol().equals(inputSymbolName)).findFirst().get();
		if (shr.getSymbol().equals(inputSymbolName))
		{

			if (shr.getShare()>=inputAmount) 
			{
				shr.setShare(shr.getShare()+inputAmount);//Updating the company Share
				stockAcc.sell(inputUserName,inputAmount,inputSymbolName);

				Transaction transaction=new Transaction();
				List<SellTransact> sellTransactionList=transactions.getSelltransacts();
				transaction.setUserName(inputUserName);
				transaction.setShare(inputAmount);
				transaction.setSymbol(inputSymbolName);

				SellTransact sellTransacts=new SellTransact();
				sellTransacts.setTransaction(transaction);
				sellTransactionList.add(sellTransacts);

				transactions.setSelltransacts(sellTransactionList);
				objectMapper.writeValue(transactionFile,transactions);
 			
				//objectMapper.writeValue(/*transactionFile*/"/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/jsonTransaction.json",transactions);
			}
		} else
		{
			System.out.println("Share not Available");
		}

		objectMapper.writeValue(companyFile, stock);
		stockAcc.printReport();

	}

	// To List the company pojo
	public static void ViewCompanyList() throws IOException
	{
		Stock stock=objectMapper.readValue(companyFile, Stock.class);
		int count=0;
		System.out.println();
		System.out.println("value of each STOCK REPORT:");
		System.out.println();
		while (count != stock.getShares().size())
		{
			Share st=stock.getShares().get(count);
			System.out.print(st.getName() + " ");
			double eachStock=(st.getShare()*st.getPrice());
			System.out.println(eachStock);
			count++;
		}
		System.out.println();
	}

	/*
	 * To take input from user for product properties
	 * 
	 * @return is class type of productproperty
	 */
	public static Share input() 
	{
		Share share=new Share();
		
		System.out.println("Enter the name of Share  ");
		String inputShareName=String_input.next();
		share.setName(inputShareName);
		System.out.println("Enter the Share ");
		int inputShare=int_input.nextInt();
		share.setShare(inputShare);
		System.out.println("Enter the Price ");
		double inputShareprice=int_input.nextDouble();
		share.setPrice(inputShareprice);
		System.out.println("Enter the Symbol ");
		String inputShareSymbol=String_input.next();
		share.setSymbol(inputShareSymbol);
	
		return share;

	}

	// To create an Account for an User
	public static void createUserAccount() throws IOException 
	{
		try{
			UserAccounts userAccs=objectMapper.readValue(userFile, UserAccounts.class);
		
			
			UserAccount userAcc=new UserAccount();
			System.out.println("Enter User name");
			String userName=String_input.next();
			userAcc.setName(userName);
			// To Set the product properties
			Share share=input();
			// Adding properties to list
			List<Share> shares=new ArrayList<Share>();
			shares.add(share);

			// add properties to the product
			userAcc.setShares(shares);

			List<UserAccount> userAccounts=userAccs.getUserAccs();
			userAccounts.add(userAcc);

			// adding list of products to inventry
			userAccs.setUserAccs(userAccounts);

			// Writtting to a file
			objectMapper.writeValue(userFile,userAccs);
			

		} catch (Exception e)
		{
			System.out.println("Input Incorrect");

		}
	}

	// To create an Account for an Company
	public static void createCompany() throws IOException
	{
		try {
			Stock stock=objectMapper.readValue(companyFile, Stock.class);

			// To Set the product properties
			Share share=input();

			// Adding properties to list

			// adding every product to list
			// getting product from file as list and saving in product list
			List<Share> shrs=stock.getShares();
			shrs.add(share);

			// adding list of products to inventry
			stock.setShares(shrs);

			// Writtting to a file
			objectMapper.writeValue(companyFile,stock);

		} catch (Exception e) 
		{
			System.out.println("Input Incorrect");

		}
	}

	public StockMaintain()
	{
		super();
	}

	public static void removeCompany(File file) throws IOException 
	{	
		System.out.println("Enter the Symbol");
		String inputSymbol=String_input.next();
		Stock stock=objectMapper.readValue(companyFile, Stock.class);
		stock.getShares().removeIf(sym->sym.getSymbol().equals(inputSymbol));
		objectMapper.writeValue(file,stock);

	}
}