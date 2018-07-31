package com.stackroute.demo;
import java.util.*;

public class Palindrome {
public static void main(String args[]) {
	int n;
	int temp;
	int count=0;
	Scanner in=new Scanner(System.in);
	 System.out.println("enter input:");
	 n= in.nextInt();
	 int temp1=n;
	 while(temp1>0)
	 {
		 temp1=temp1/10;
		 count++;
	 }
	 //System.out.println(count);
	 int arr[]=new int[count];	 
	 //System.out.println(n);
	 int i=0;
	 while(n>0)
	 {
		 temp=n%10;
		 arr[i]=temp;
		 n=n/10;
		 i++;
	 }
	 int flag=0;
	 int mid=count/2;
	 int j;
	 for(j=0;j<mid;j++)
	 {
		 int x=count-1;
		 if(arr[j]!=arr[x])
		 {
			 break;
		 }
		 else
		 {
			 flag=1;
		 }
		 x--;
	 }
	 if(flag==0)
		 
	 {
		 System.out.println("NOT pallindrome");
	 }
	 else {
		 
		 System.out.println("pallimdrome");
		 int sum=0;
		 for(int z=0;z<count;z++)
		 {
			 if (arr[z]%2==0)
			 {
				sum=sum+arr[z]; 
			 }
		 }
		 	if(sum>25)
		 	{
		 		System.out.println("Sum of even number is greater than 25");
		 	}
		 	else
		 	{
		 		System.out.println("sum of even num is less than 25");
		 	}
	 }
}
}
