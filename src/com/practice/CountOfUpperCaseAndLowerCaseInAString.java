package com.practice;

public class CountOfUpperCaseAndLowerCaseInAString {

	public static void main(String[] args) {
		String s="TeStYantrA";
		int uppercase=0;
		int lowercase=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
			else
			{
				uppercase++;
			}
		}
		System.out.println("Uppercase count : "+uppercase);
		System.out.println("Lower Case count : "+lowercase);
		

	}

}
