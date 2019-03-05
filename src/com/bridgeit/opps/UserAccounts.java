package com.bridgeit.opps;
import java.util.List;

public class UserAccounts
{
	private List<UserAccount> userAccs;
	public List<UserAccount> getUserAccs()
	{
		return userAccs;
	}
	public void setUserAccs(List<UserAccount> userAccs) 
	{
		this.userAccs=userAccs;
	}
}