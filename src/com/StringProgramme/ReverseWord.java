package com.StringProgramme;

public class ReverseWord {

	public static void main(String[] args) {
//		String s="Welcome to to Bengaluru Bengaluru".toLowerCase();
//		String[] str=s.split(" ");
//		for(int i=str.length-1; i>=0;i--)
//		{
//			System.out.print(str[i]+" ");
//		}
		
		String s="Welcome to to Bengaluru Bengaluru".toLowerCase();
		String[] str=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0; i--)
		{
			rev=rev+str[i]+" ";
		}
		System.out.println(rev);
		
		
		
		
		
	}

}
