package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManager 
{
	public static void main(String[] args) throws IOException 
	{
		try 
		{
			ObjectMapper objectMapper=new ObjectMapper();
			File file=new File("/home/admin1/Desktop/JavaPrograms/src/Files/InventoryFactory.json");
			InventoryFactory inventoryFactory=objectMapper.readValue(file,InventoryFactory.class);
			List<Product> products=inventoryFactory.getInventoryFactory();//List of products
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the name of the product ");
			String productName=sc1.next();
			boolean temp=products.stream().filter(prd->prd.getProduct().equals(productName)).findFirst().isPresent();
			Product product;
			List<ProductProperties> properties=new ArrayList<ProductProperties>();
			if(!temp)
			{
				System.out.println(productName +" is not present in inventory");
				product=new Product();
				product.setProduct(productName);
				ProductProperties productProperty=input();
				properties.add(productProperty);
				product.setProperties(properties);
				products.add(product);
				inventoryFactory.setInventoryFactory(products);
				sc1.close();
			}
			else 
			{
				System.out.println(productName +" is present in inventory");
				product=products.stream().filter(prd->prd.getProduct().equals(productName)).findFirst().get();
				properties=product.getProperties();
				ProductProperties productProperty=input();
				properties.add(productProperty);
			}
			 objectMapper.writeValue(file, inventoryFactory);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect");
		}

	}
	public static ProductProperties input()
	{
		Scanner sc1=new Scanner(System.in);
		ProductProperties productProperty=new ProductProperties();
		System.out.println("Enter the name of product type ");
		String inputPropertyName=sc1.next();
		productProperty.setName(inputPropertyName);
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=sc1.nextDouble();
		productProperty.setWeight(inputPropertyWeight);
		System.out.println("Enter the Price ");
		double inputPropertyprice=sc1.nextDouble();
		productProperty.setPrice(inputPropertyprice);
		sc1.close();
		return productProperty;
		
	}

}