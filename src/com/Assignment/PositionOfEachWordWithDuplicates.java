package com.Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PositionOfEachWordWithDuplicates {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] sarr = s.split(" ");
		ArrayList<String> list= new ArrayList<String>();
		//LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0; i<sarr.length;i++)
		{
			list.add(sarr[i]);
		}
		for(String s1:list)
		{
			for(int i=0; i<sarr.length;i++)
			{
				if(s1==sarr[i])
				{
					System.out.println(s1+" position is --> "+(i+1));
				}
			}
		}

	}

}
