package com.StringProgramme;

public class ReverseAnString {

	public static void main(String[] args) {
		String s="TestYantya";
		System.out.println("===============================Approach 1=============================");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+"");
		}
		System.out.println();
		System.out.println("===============================Approach 2=============================");
		char[] st = s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}
		System.out.println();
		System.out.println("===============================Approach 3=============================");
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		System.out.println("===============================Approach 4=============================");
		char[] ch = s.toCharArray();
		int count=0;
		for(char c: ch)
		{
			count++;
		}
		for(int i=count-1;i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("===============================Approach 5=============================");
		StringBuilder sb= new StringBuilder(s);
		System.out.println(sb.reverse());

	}

}
