package com.stackroute.demo;
import java.util.*;
import java.util.Scanner;

public class UnspecifiedNum {
	public  int func(String s)
	{
		String arr[]=s.split(" ");
		int len=arr.length;
		int i=0;
		int sum=0;
		for(i=0;i<len;i++)
		{
			sum=sum+Integer.parseInt(arr[i]);
		}
		return sum;
	}
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter num:");
	String s=in.nextLine();
	System.out.println(s);
	UnspecifiedNum obj=new UnspecifiedNum();
	int res=obj.func(s);
	System.out.println("sum is:"+res);
}
}
