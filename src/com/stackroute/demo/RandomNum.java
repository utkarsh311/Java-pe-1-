package com.stackroute.demo;
import java.util.*;
public class RandomNum {
public static void main(String args[])
{
	Scanner in=new Scanner (System.in);
	Random rand = new Random();
	int num=rand.nextInt(100);
	while(true)
	{
		System.out.println("Enter your guess");
		int guess=in.nextInt();
		if(num==guess)
		{
			System.out.println("BINGO");
			break;
		}
		else if(num>guess)
		{
			System.out.println("guess is smaller than num");
		}
		else
		{
		System.out.println("guess is larger than num");
		}
	}
}
}
