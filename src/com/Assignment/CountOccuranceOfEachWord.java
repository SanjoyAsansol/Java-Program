package com.Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountOccuranceOfEachWord {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] sarr = s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		//ArrayList<String> set= new ArrayList<String>();
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
			System.out.println(s1+" present "+count+" times");
		}
	}
}
