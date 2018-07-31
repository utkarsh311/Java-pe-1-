package com.stackroute.demo;
import java.util.*;
public class LowerUpperCase {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.print("enter input:");
	String s=in.nextLine();
	char ch = s.toCharArray()[0];
	if(ch>=65 && ch<=90)
	{
		System.out.println("upper case");
	}
	else
	{
		System.out.println("lower case");
	}
}
}
