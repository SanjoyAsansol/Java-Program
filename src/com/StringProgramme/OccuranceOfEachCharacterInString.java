package com.StringProgramme;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		String s= "testyantra";
		char[] ch= s.toCharArray();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for(int i=0; i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(Character c: set)
		{
			int count=0;
			for(int i=0; i<ch.length; i++)
			{
				if(c==ch[i])
				{
					count++;
				}
			}
		System.out.println(c+" repeting "+count+" times");
		}
	}
}
