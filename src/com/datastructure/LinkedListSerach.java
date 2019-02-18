package com.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LinkedListSerach 
{
	public static void main(String[] args) throws IllegalAccessException 
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=null;
		try
		{
		String path="/home/admin1/Desktop/linkedSample.txt";
		File f=new File(path);
		if(path==null) 
			throw new IllegalAccessException("Path is incorrect");
		
		else if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			br=new BufferedReader(new FileReader(f));
			String line="";
			String str="";
			while((str=br.readLine())!=null)
			{
				line+=str;
			}
			String[] word=line.split(" ");
			UnorderedList<String> li=new UnorderedList<>();
			for(int i=0;i<word.length;i++)
				li.add(word[i]);
			li.print();
			System.out.println("Enter key");
			String key=sc.nextLine();
			if(li.search(key))
			{
				li.pop(li.index(key));
			}
			else
			{
				li.add(key);
			}
			li.print();
			li.writeToFile(li, f);
		}
		}catch(IOException e)
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
