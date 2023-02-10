package com.StringProgramme;

public class StringPalinDromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="malayalam";
//		String rev="";
//		
//		for(int i=0; i<s.length();i++)
//		{
//			char c1=s.charAt(i);
//			for(int j=s.length()-1; j>=0;j++)
//			{
//				char c2=s.charAt(j);
//				if(c1==c2)
//				{
//					System.out.println("Palindrome");
//				}
//				else
//				{
//					System.out.println("not  palindrome");
//				}
//			}
//		}
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
		
	}
}
