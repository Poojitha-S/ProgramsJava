package com.bridgeLabz.functional;
import com.Util.functional.*;

import Util.UtilClass;

public class Distance 
{
		public static void main(String[] args) 
		{
			try
			{
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				double result=UtilClass.euclideanDistance(x, y);
				System.out.println("the EuclideanDistance is:  "+result);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
	
}