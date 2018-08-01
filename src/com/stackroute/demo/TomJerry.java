package com.stackroute.demo;

import java.util.Scanner;

public class TomJerry {
	public String result(int n)
	{
	if(n %2==0 && n>20 && n<30)
	{
		return "jerry";
	}
	if(n%2 !=0 && n>20 && n<30)
	{
		return "tom";
	}
	return null;
}
	public static void main(String args[]) {
		int n;
		Scanner in =new Scanner(System.in);
		System.out.print("enter num:");
		n=in.nextInt();
		TomJerry Obj=new TomJerry();
			String res=Obj.result(n);			
			System.out.println(res);
	}
}
