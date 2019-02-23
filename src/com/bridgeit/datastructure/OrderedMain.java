package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderedMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IllegalAccessException 
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=null;
		try
		{
			String[] num;
			String line="";
			int key;
			String path="/home/admin1/Desktop/Files/linkedInteger.txt";
			File f=new File(path);			
			if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
			{
				br=new BufferedReader(new FileReader(f));
				String temp=null;
				while((temp=br.readLine())!= null)
				{
					line+=temp;
				}
				num=line.split(", ");
				OrderedList<Integer> list=new OrderedList<>();
				for(int i=0;i<num.length;i++) 
				{
					list.add(Integer.parseInt(num[i]));
				}
				list.printOrderedList();
				System.out.println("Enter the key");
				try 
				{
					Scanner sc1=new Scanner(System.in);
					key=sc1.nextInt();
					boolean isKeyPresent=list.search(key);
					if(isKeyPresent)
					{
						System.out.printf("key '%s' is present in the list\n",key);
						list.remove(key);
					}
					else 
					{
						System.out.printf("key '%s' is not present in the list\n",key);
						list.add(key);
					}
					System.out.println("After Updation");
					System.out.println("-------------------------------------");
					list.printOrderedList();
					sc1.close();
				}
				catch(InputMismatchException e)
				{
					System.out.println("Key must be a number ...!");
				}
				list.writeToFile(list,path);
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(br!=null)
			{
				try{
					br.close();
				}catch(IOException e)
				{
						e.printStackTrace();
				}
			}
		}
	}
}


	


