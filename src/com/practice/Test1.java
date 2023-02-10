package com.practice;

public class Test1 {

	public static void main(String[] args) {
		String s="Hello".toUpperCase();
		char[] str=s.toCharArray();
		//String temp= str[0];
		for(int i=1; i<str.length; i++)
		{
			System.out.print(str[i]+"");
		}
		

	}

}
