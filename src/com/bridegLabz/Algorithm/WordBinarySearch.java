package com.bridegLabz.Algorithm;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import Util.UtilClass;

public class WordBinarySearch
{
	public static void main(String[] args) throws IOException, IllegalAccessException 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		String path="/home/admin1/Desktop/Sample.txt";
		File f=new File(path);
		if(path==null) 
			throw new IllegalAccessException("Path is incorrect");
		
		else if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			System.out.println("Enter the word to serach:");
			String word=sc.nextLine();
			UtilClass.wordSerach(path, word);
		}
		else
		{
			System.out.println("File path not found");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
