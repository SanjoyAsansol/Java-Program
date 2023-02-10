package com.StringProgramme;

public class CountUpperCaseAndLowerCaseInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "TesTYaNtRa";
		int uppercount=0;
		int lowercount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>= 'A' && s.charAt(i)<='Z')
			{
				uppercount++;
			}
			else if(s.charAt(i)>= 'a' && s.charAt(i)<='z')
			{
				lowercount++;
			}
		}
		System.out.println("Upper Case count : "+uppercount);
		System.out.println("Lower Case count : "+lowercount);
		
	}

}
