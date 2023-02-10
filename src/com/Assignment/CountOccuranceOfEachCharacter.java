package com.Assignment;

import java.util.LinkedHashSet;

public class CountOccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="TestYantra";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch: set)
		{
			int count=0;
			for(int i=0; i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" Repeting "+count+" times");
		}
	}

}
