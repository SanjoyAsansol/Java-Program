package com.StringProgramme;

public class SwapFirstAndLast {

	public static void main(String[] args) {
		String s="Welcome to Banglore city";// city to Banglore Welcome
		String[] str=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]= temp;
		for(String s1 : str)
		{
			System.out.print(s1+" ");
		}
		System.out.println();
		for(int i=0;i<str.length;i++)
		{
			
			System.out.print(str[i]+" ");
		}
		

	}

}
