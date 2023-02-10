package com.StringProgramme;

import java.util.LinkedHashSet;

public class CountNoOfVowelInStringWithOutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "TestYantra".toLowerCase();// eaa
		
		LinkedHashSet<Character> set =new LinkedHashSet<Character>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch: set)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch);
			}
			
		}
		System.out.println("No of Vowel Present in a String is : "+count);
		

	}

}
