package com.stackroute.demo;
import java.util.*;
public class Iteration {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.print("enter no of iterations:");
	int num=in.nextInt();
	int i;
	int n;
	int temp;
	for(i=1;i<=num;i++)
	{
		temp=i;
		n=i;
		while(n>0)
		{
			System.out.println(temp);
			n--;
		}
		
	}
}
}