package com.practice;

import java.util.LinkedHashSet;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		String s="TestYantra";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch+" ");
			}
		}
		

	}

}
