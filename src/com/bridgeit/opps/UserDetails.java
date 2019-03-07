package com.bridgeit.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDetails {
	public static void main(String[] args) 
	{
		UserDetails userDetail=new UserDetails();
		userDetail.addUser();
	}
	public void addUser()
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			ObjectMapper obj=new ObjectMapper();
			File file=new File("/home/admin1/Desktop/JavaPrograms/src/Files/UserAccount.json");
			UserAccountList userAccount = null;
			if(file.length() != 0){
				userAccount = obj.readValue(file,UserAccountList.class);
			}else{
				userAccount = new UserAccountList();
				userAccount.setUserAccount(new ArrayList<>());
			}
			UserAccount newUser=getUser();
			userAccount.getUserAccount().add(newUser);
			obj.writeValue(file, userAccount);
			System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(userAccount));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}
	}
	public static UserAccount getUser() 
	{
		UserAccount user =new UserAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.next();
		user.setUserName(name);
		System.out.println("Enter the share ");
		int share=sc.nextInt();
		user.setShare(share);
		System.out.println("Enter the Price ");
		double price=sc.nextDouble();
		user.setPrice(price);
		return user;
	}
	
}
