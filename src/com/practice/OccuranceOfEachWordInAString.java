package com.practice;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInAString {

	public static void main(String[] args) {
		String s="Welcome to to Banglore Banglore ";
		String[] str=s.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String s1:set)
		{
			int count =0;
			for(int i=0;i<str.length; i++)
			{
				if(s1.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(s1+" present "+count+" times");
		}
	}
}
