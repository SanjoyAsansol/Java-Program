package com.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueWordsInString {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] sarr = s.split(" ");
		for(int i=0; i<sarr.length;i++)
		{
			String s1=sarr[i];
			int count=0;
			for(int j=0; j<sarr.length;j++)
			{
				String s2=sarr[j];
				if(s1.equals(s2) && i>j)
				{
					break;
				}
				if(s1.equals(s2))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(sarr[i]+" is unique");
			}
		}
//		String s="I am from from am Testyantra";
//		String[] sarr = s.split(" ");
//	
//		HashSet<String> set= new HashSet<String>();
//		for(int i=0; i<sarr.length;i++)
//		{
//			set.add(sarr[i]);
//		}
//		for(String s1: set)
//		{
//			int count=0;
//			for(int j=0;j<sarr.length;j++)
//			{
//				if(s1==sarr[j])
//				{
//					count++;
//					break;
//				}
//			}
//			if(count==1)
//			{
//				System.out.println(s1+" present"+count+" times");
//			}
//		}
//		
	}
}


















