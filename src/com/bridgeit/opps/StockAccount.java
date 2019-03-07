package com.bridgeit.oops;

public class StockAccount
{
	UserDetails userDetail;
	StockDetails stockDetail;
	public void buy(double amount,String symbol)
	{
		
	}
	public void sell(double amount,String symbol)
	{
		
	}
	public void save()
	{
	}
	public void addUser()
	{
		userDetail=new UserDetails();
		userDetail.addUser();
	}
	public void addCompany()
	{
		stockDetail = new StockDetails();
		stockDetail.addStock();
	}
}
