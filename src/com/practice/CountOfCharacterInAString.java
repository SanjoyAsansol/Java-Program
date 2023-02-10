package com.practice;

import java.util.LinkedHashSet;

public class CountOfCharacterInAString {

	public static void main(String[] args) {
		String s="TestYantra iss a good Compant";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" present---> "+count+" times");
		}

	}

}
