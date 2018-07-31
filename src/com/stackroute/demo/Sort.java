package com.stackroute.demo;
import java.util.Scanner;
public class Sort {
	public static void main(String args[])
{
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
	 int tempo;
	 int total=0;
	 while(n>0)
	 {
		 temp=n%10;
		 arr[i]=temp;
		 n=n/10;
		 i++;
	 }
	 for(int k=0;k<count;k++)
	 {
		 for(int l=0;l<count-1;l++)
		 {
			 if(arr[l]<arr[l+1])
			 {
				 tempo=arr[l+1];
				 arr[l+1]=arr[l];
				 arr[l]=tempo;
			 }
		 }
	 }
	 System.out.println("sorted array is:");
	 for(int q=0;q<count;q++)
	 {
		 System.out.println(arr[q]);
		 if(arr[q]%2==0)
		 {
			 total=total+arr[q];
		 }
	 }
	 System.out.println("Sum of even numbers is: "+total);
	 if(total>25)
	 {
		 System.out.println("TRUE");
	 }
	 else {
		 System.out.println("FALSE");
	 }	
}
}