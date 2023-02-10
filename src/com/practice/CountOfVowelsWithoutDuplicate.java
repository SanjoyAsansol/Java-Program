package com.practice;

import java.util.LinkedHashSet;

public class CountOfVowelsWithoutDuplicate {

	public static void main(String[] args) {
		String s ="TestYantraais";
		char[] ch =s.toLowerCase().toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int vcount=0;
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(Character c:set)
		{
			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
			{
				vcount++;
			}
			System.out.print(c+" ");
		}
		
		System.out.println(vcount);
				
		

	}

}
