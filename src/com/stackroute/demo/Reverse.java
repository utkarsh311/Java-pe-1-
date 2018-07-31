package com.stackroute.demo;
import java.util.*;
public class Reverse {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.print("enter your string:");
	String s= in.nextLine();
	int len=s.length();
	char[] my= new char[len];
	System.out.println(len);
	int j=0;
	for(int i=len-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		my[j]=ch;
		j++;
	}
	System.out.println(my);
}
}
