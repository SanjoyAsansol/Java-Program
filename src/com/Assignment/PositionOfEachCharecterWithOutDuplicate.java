package com.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfEachCharecterWithOutDuplicate {

	public static void main(String[] args) {
		String s="TestYantra";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch: set)
		{
			for(int i=0; i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
		}
		

	}

}
