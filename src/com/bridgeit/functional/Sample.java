package com.bridgeit.functional;

public class Sample {

	public static void main(String[] args) 
	{
		Sample1<Object> sam1=new Sample1<>();
		System.out.println(sam1.sam(7));
		System.out.println(sam1.sam("xx"));
		System.out.println(sam1.sam(7.666));
	}

}
