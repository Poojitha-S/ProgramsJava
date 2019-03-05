package com.bridgeit.opps;

import java.util.List;

public class UserAccount
{
	private String name;
	private List<Share> shares;

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public List<Share> getShares() 
	{
		return shares;
	}

	public void setShares(List<Share> shares) 
	{
		this.shares=shares;
	}

		

	
}