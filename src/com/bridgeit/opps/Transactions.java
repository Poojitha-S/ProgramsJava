package com.bridgeit.opps;

import java.util.List;

public class Transactions
{
	List<BuyTransact> buyTransacts;
	List<SellTransact> selltransacts;
	public List<BuyTransact> getBuyTransacts()
	{
	return buyTransacts;
	}
	public void setBuyTransacts(List<BuyTransact> buyTransacts) 
	{
	this.buyTransacts=buyTransacts;
	}
	public List<SellTransact> getSelltransacts()
{
	return selltransacts;
}
	public void setSelltransacts(List<SellTransact> selltransacts) 
	{
	this.selltransacts=selltransacts;
	}
}