package com.Assignment;


import java.util.LinkedHashSet;

public class UniqueCharecterInString {

	public static void main(String[] args) {
		String s="TestYantra";
		//String s= "Sanjoyssoo";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		System.out.println(set);
		for(Character ch: set)
		{
			System.out.print(ch+" ");
		}
//		for(Character ch: set)
//		{
//			for(int i=0; i<str.length();i++)
//			{
//				if(ch==str.charAt(i))
//				{
//					System.out.print(ch+" ");
//					break;
//				}
//			}
//		}

	}

}
