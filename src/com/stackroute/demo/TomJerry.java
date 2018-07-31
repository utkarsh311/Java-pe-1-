package com.stackroute.demo;

import java.util.Scanner;
public class TomJerry {
	public static void main(String args[]) {
		int n;
		Scanner in =new Scanner(System.in);
		System.out.print("enter num:");
		n=in.nextInt();
		if(n %2==0 && n>20 && n<30)
		{
			System.out.println("JERRY");
		}
		if(n%2 !=0 && n>20 && n<30)
		{
			System.out.println("TOM");
		}
		
}
}
