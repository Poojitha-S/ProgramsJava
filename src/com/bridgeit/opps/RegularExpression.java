package com.bridgeit.oops;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String input = "Hello <<name>>, We have your full"+
					   "name as <<full name>> in our system. your contact number is <<91-xxxxxxxxxx>>."+
				       "Please,let us know in case of any clarification Thank you BridgeLabz <<xx/xx/xxxx>>.";
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc1.next();
		if(Pattern.matches("[a-zA-Z]{2,}",name))
		{
			input=input.replaceAll("<<name>>",name);
		}
		System.out.println("Enter your Full Name");
		String fullName=sc1.next();
		if(Pattern.matches("[a-zA-Z]+",fullName))
		{
			input=input.replaceAll("<<full name>>", fullName);
		}
		System.out.println("Enter your Contact Number");
		long temp=sc1.nextLong();
		String number=String.valueOf(temp);
		if(Pattern.matches("[789][0-9]{9}",number))
		{
			input=input.replaceAll("<<91-xxxxxxxxxx>>",number);
		}
		Date currentDate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdf.format(currentDate);
		input=input.replace("<<xx/xx/xxxx>>",date);
		System.out.println(input);
		sc1.close();
	}

}

  


