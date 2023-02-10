package com.Assignment;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithOutDuplicates {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] sarr = s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0;i<sarr.length;i++)
		{
			set.add(sarr[i]);
		}
		for(String s1: set)
		{
			for(int i=0;i<sarr.length;i++)
			{
				if(s1==sarr[i])
				{
					System.out.println(s1+" --->is in --->"+(i+1)+" position");
				}
			}
		}

	}

}
