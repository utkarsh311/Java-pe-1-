package com.stackroute.demo;
import java.util.*;
public class ConsoVovel {
public static void  main(String args[])
{
	Scanner in=new Scanner(System.in);
	String s;
	System.out.print("enter string:");
	s=in.nextLine();
	//System.out.println(s);
	int i;
	int len=s.length();
	//String[] ary= s.split("");
	for(i=0;i<len;i++)
	{
		char c=s.charAt(i);
		if(c == 'a' || c== 'e'|| c== 'i'|| c== 'o' || c== 'u')
		{
			System.out.println(c+" is vovel");
		}
		else
		{
			System.out.println(c+" is consonant");
		}
	}
}
}
