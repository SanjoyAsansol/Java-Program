package com.practice;

public class ReverseEachCharacterInASentence {

	public static void main(String[] args) {
		String s ="My Name Is Sanjoy Mondal";
		String[] str=s.split(" ");
		for(int i=0; i<str.length-1; i++)
		{
			 String st = str[i];
			 for(int j=st.length()-1; j>=0; j--)
			 {
				 System.out.print(st.charAt(j));
			 }
			 System.out.print(" ");
		}
	}
}
