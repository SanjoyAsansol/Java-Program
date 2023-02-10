package com.Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountHowManyTimesDuplicateCharIsRepetating {

	public static void main(String[] args) {
		String s="TestYantra";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch : set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
				count++;
				
				}
			}
			if(count>1)
			{
			System.out.println(ch+" repeting "+count+" times");
			}
		}
	}

}
