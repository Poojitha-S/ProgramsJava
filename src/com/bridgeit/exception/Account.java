package com.bridgeit.exception;

public class Account 
{
    private static int balance = 10000;
    public int balance() 
    {
        return balance;
    }
    public  int withdraw(int amount) throws InSufficientFundException 
    {
       if (amount > balance) 
           throw new InSufficientFundException("Current balance "+balance+" is less than requested amount "+ amount);
       return balance = balance - amount;
    }
 
    public int deposit(int amount)throws InSufficientFundException 
    {
        if (amount <= 0) 
            throw new InSufficientFundException("Invalid deposit amount "+ amount);
        return balance = balance +amount;
    }
}
 