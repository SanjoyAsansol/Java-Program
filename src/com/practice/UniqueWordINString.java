package com.practice;

import java.util.HashSet;

public class UniqueWordINString {

	public static void main(String[] args) {
		String s="I am from from am Testyantra";
		String[] arr = s.split(" ");
		HashSet<String> set= new HashSet<String>();
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		for(String word: set)
		{
			int count=0;
			for(int i=0; i<arr.length;i++)
			{
				if(word.equals(arr[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(word);
			}
		}

	}

}
