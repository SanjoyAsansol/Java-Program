package com.practice;

public class Append0AtFirst {

	public static void main(String[] args) {
		int[] a= {1,1,1,0,0};//11000
		int[] b= new int[a.length];
		int first=0;
		int last=a.length-1;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==1)
			{
				b[last] =a[i];
				last--;
			}
			else
			{
				b[first]=a[i];
				first++;
			}
		}
		for(int inte: a)
		{
			System.out.print(inte+" ");
		}

	}

}
