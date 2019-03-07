package com.bridgeit.oops;

import java.io.File;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockDetails
{
	public static void main(String[] args) 
	{
		StockDetails stockDetail = new StockDetails();
		stockDetail.addStock();
	}
	public void addStock()
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			ObjectMapper obj=new ObjectMapper();
			File file=new File("/home/admin1/Desktop/JavaPrograms/src/Files/stock.json");
			StocksList allStocks = null;
			if(file.length() != 0){
				allStocks = obj.readValue(file,StocksList.class);
			}else{
				allStocks = new StocksList();
				allStocks.setAllstocks(new ArrayList<>());
			}
			Stock newStock=getStock();
			allStocks.getAllstocks().add(newStock);
			obj.writeValue(file, allStocks);
		//System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(allStocks));
		reportTotal(allStocks); 
			report(allStocks);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}
	}
	public static Stock getStock() 
	{
		Stock stk =new Stock();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.next();
		stk.setName(name);
		System.out.println("Enter the share ");
		int share=sc.nextInt();
		stk.setShare(share);
		System.out.println("Enter the price ");
		double price=sc.nextDouble();
		stk.setPrice(price);
		System.out.println("Enter the symbol ");
		String symbol=sc.next();
		stk.setSymbol(symbol);
		return stk;
	}
	public static void report(StocksList allStocks) 
	{
		List<Stock> stocks = allStocks.getAllstocks();
		double res = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of stock ");
		String name=sc.next();	
		for(Stock k:stocks){
			if(k.getName().equals(name))
			{
				res=k.getPrice()*k.getShare();
			}
		}
		System.out.println("Share of "+name +" : "+res);
	}
	public static void reportTotal(StocksList allStocks) 
	{
		List<Stock> stocks = allStocks.getAllstocks();
		long res1 =1;
		long temp=0;
		for(Stock k:stocks){
				res1=(long) (k.getPrice()*k.getShare());
				temp+=res1;
			}
		System.out.println("Total share : "+temp);
	}
}
