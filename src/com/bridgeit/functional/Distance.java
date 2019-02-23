package com.bridgeit.functional;
import java.util.InputMismatchException;

import com.bridgeit.util.Utility;

public class Distance 
{
		public static void main(String[] args) 
		{
			try
			{
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				double result=Utility.euclideanDistance(x, y);
				System.out.println("the EuclideanDistance is:  "+result);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Input must be integer");
				System.out.println();
			}
		}	
	
}