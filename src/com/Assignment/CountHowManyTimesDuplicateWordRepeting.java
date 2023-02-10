package com.Assignment;

import java.util.LinkedHashSet;

public class CountHowManyTimesDuplicateWordRepeting {
public static void main(String[] args) {
	String s="I am from from am Testyantra";
	String[] sarr = s.split(" ");
	LinkedHashSet<String> set= new LinkedHashSet<String>();
	for(int i=0; i<sarr.length;i++)
	{
		set.add(sarr[i]);
	}
	for(String s1: set)
	{
		int count=0;
		for(int i=0; i<sarr.length;i++)
		{
			if(s1.equals(sarr[i]))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(s1+" repeting "+count+" times");
		}
	}
	
}
}
