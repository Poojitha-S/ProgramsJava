package com.bridgeit.opps;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;


public class StockAccount
{
	 File userFile;
	static ObjectMapper objectMapper=new ObjectMapper();
	static File companyFile=new File("/home/admin1/Desktop/Files/JSON/jsonCompanyShare.json");
	double accDollars;
	UserAccounts userAccs;
	//Total Value of Account
	public double valueOf()
	{
		return accDollars;
	}
	//To buy the share and update in userAccount
	public void buy(String name,int amt,String symbol) throws Exception 
	{
		userAccs=objectMapper.readValue(userFile,UserAccounts.class);
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
	}
	//To sell the share from user yo company and update in userAccount
	public void sell(String name,int amt,String symbol) throws  IOException
	{
		System.out.println("........................");
		userAccs=objectMapper.readValue(userFile, UserAccounts.class);
		//Calculating the Share that can be purchased for the amount
		Stock shareList=objectMapper.readValue(companyFile, Stock.class);
		List<Share> shares=shareList.getShares();
		Share shareOfComp=shares.stream().filter(shr->shr.getSymbol().equals(symbol)).findFirst().get();
		double sh=shareOfComp.getPrice();
		
		 //Upating the shares that he bought
		 List<UserAccount> userAccounts=userAccs.getUserAccs();
		 UserAccount userAcc=userAccounts.stream().filter(usr-> usr.getName().equals(name)).findFirst().get();
		 Share share=userAcc.getShares().stream().findFirst().get();
		 share.setShare(share.getShare()-amt);
		 share.setPrice(sh);
		 share.setSymbol(symbol);
		 accDollars=share.getShare()*share.getPrice();
		 save();
	}
	//Writtting to a file
	public void save() throws IOException 
	{
		objectMapper.writeValue(userFile, userAccs);
	}
	//To print the Report of user
	public void printReport() throws IOException 
	{
		 userAccs=objectMapper.readValue(userFile, UserAccounts.class);
		int count=0;
		
		System.out.println("USER REPORT");
		System.out.println();
		while(count!=userAccs.getUserAccs().size())
		{
			UserAccount st=userAccs.getUserAccs().get(count);
			System.out.print("User Name -> ");
			System.out.println(st.getName());
			for(Share share1: st.getShares())
			{
				System.out.print("  "+share1.getName() +" ->");
				double eachStock =(share1.getShare()*share1.getPrice());
				System.out.println(eachStock);
			}
			count++;
			}
		System.out.println();
	}
	public StockAccount(String fileName) {
		userFile=new File(fileName);
	}
	
}