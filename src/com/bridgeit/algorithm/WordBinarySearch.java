package com.bridgeit.algorithm;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.util.Utility;

public class WordBinarySearch
{
	public static void main(String[] args) throws IOException, IllegalAccessException 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		String path="/home/admin1/Desktop/Files/Sample.txt";
		File f=new File(path);
		if(path==null) 
			throw new IllegalAccessException("Path is incorrect");
		
		else if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			System.out.println("Enter the word to serach:");
			String word=sc.nextLine();
			int res=Utility.wordSerach(path, word);
			if(res>0)
				System.out.println("The word "+(char)34+word+(char)34+","+" is present in the file Sample.txt");
			else
				System.out.println("The word "+(char)34+word+(char)34+","+" is not present in the file Sample.txt");
			
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
