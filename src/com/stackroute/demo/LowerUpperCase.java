package com.stackroute.demo;
import java.util.*;
public class LowerUpperCase {
	public String check(String s)
	{
		char ch = s.toCharArray()[0];
		if(ch>=65 && ch<=90)
		{
			return "UpperCase";
		}
		else
		{
			return "LowerCase";
		}	
	}
	
public static void main(String args[])
{
	LowerUpperCase ob=new LowerUpperCase();
	Scanner in=new Scanner(System.in);
	System.out.print("enter input:");
	String s=in.nextLine();
	String q=ob.check(s);
	System.out.println(q);
	
}
}
