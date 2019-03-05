package com.bridgeit.objectorientedprogram;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDataManagement {
	
	public static void main(String[] args) throws IOException  {
		try {
			Scanner sc=new Scanner(System.in);
			ObjectMapper obj=new ObjectMapper();
			File file=new File("/home/admin1/Desktop/Files/Inventory.json");
			ProductList productList=obj.readValue(file,ProductList.class);
			Product product=new Product();
			System.out.println("Enter the product name ");
			String inputProductName=sc.nextLine();
			inputProductName=inputProductName.toLowerCase();
			if(inputProductName.equals("rice")||inputProductName.equals("pulses")||inputProductName.equals("wheats"))
			{
				product.setProduct(inputProductName);
				ProductProperties productProperty= input();
				List<ProductProperties> properties= new ArrayList<ProductProperties>();
				properties.add(productProperty);
				product.setProperties(properties);
				List<Product> products=productList.getInventory();
				products.add(product);
				productList.setInventory(products);
				obj.writeValue(file, productList);
				ObjectMapper objectMapper2 =new ObjectMapper();
				System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(productList));
			}
			else 
			{
				System.out.println("InCorrect input please run again...!");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}


	}
	public static ProductProperties input() {

		ProductProperties productProperty=new ProductProperties();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of product type ");
		String inputPropertyName=sc.nextLine();
		productProperty.setName(inputPropertyName);
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=sc.nextDouble();
		productProperty.setWeight(inputPropertyWeight);
		System.out.println("Enter the Price ");
		double inputPropertyprice=sc.nextDouble();
		productProperty.setPrice(inputPropertyprice);
		System.out.println();
		return productProperty;
	}
}

    