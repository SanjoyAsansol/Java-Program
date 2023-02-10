package com.StringProgramme;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInAString {

	public static void main(String[] args) {
		String s="Welcome to city Banglore city";
		String[] str=s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String st: set)
		{
			int count=0;
			for(int i=0; i<str.length;i++)
			{
				if(st.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(st+" present "+count+" Times");
		}
		

	}

}
