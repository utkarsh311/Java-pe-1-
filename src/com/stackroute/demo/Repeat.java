package com.stackroute.demo;
import java.util.*;
public class Repeat {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.print("enter string:");
	String s=in.nextLine();
	String [] str = s.split("");
	System.out.print("enter repetition:");
	int n=in.nextInt();
	int len=s.length();
	String my = "";
	int j = 0;
	for(int i=len-n;i<len;i++)
	{
		my =my + str[i];
	}
	System.out.print(s);
	while(n != 0) {
		System.out.print(my);
		n--;
	}
}
}