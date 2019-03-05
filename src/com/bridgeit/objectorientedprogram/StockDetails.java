package com.bridgeit.objectorientedprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockDetails {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			ObjectMapper obj=new ObjectMapper();
			File file=new File("/home/admin1/Desktop/Files/stock.json");
			Stock stk=obj.readValue(file,Stock.class);
			Share sh=new Share();
			System.out.println("Enter the company name ");
			String input=sc.nextLine();
			System.out.println("Enter no of shares");
			int noOfShares=sc.nextInt();
			List<Share> sh1=stk.getStock();
			for(int i=0;i<noOfShares;i++)
			{
				sh.setStockName(input);
				Properties property= input();
				List<Properties> properties= new ArrayList<Properties>();
				properties.add(property);
				sh.setProperties(properties);
				List<Share> pros=stk.getStock();
				stk.setStock(pros);
				sh1.add(sh);
				stk.setStock(sh1);
				obj.writeValue(file, stk);
			}
			ObjectMapper objectMapper2 =new ObjectMapper();
			System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(sh1));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}
	}
	public static Properties input() {

		Properties property=new Properties();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of investor ");
		String name=sc.next();
		property.setName(name);
		System.out.println("Enter the share ");
		int share=sc.nextInt();
		property.setShare(share);
		System.out.println("Enter the Price ");
		double price=sc.nextDouble();
		property.setPrice(price);
		System.out.println();
		return property;
	}
}
