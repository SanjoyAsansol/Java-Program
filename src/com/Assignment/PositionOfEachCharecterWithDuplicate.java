package com.Assignment;

import java.util.ArrayList;

public class PositionOfEachCharecterWithDuplicate {

	public static void main(String[] args) {
		String s="TestYantra";
//		String str=s.toLowerCase();
//		ArrayList<Character> list= new ArrayList<>();
//		for(int i=0; i<str.length();i++)
//		{
//			list.add(str.charAt(i));
//		}
//		for(Character ch: list)
//		{
//			for(int i=0; i<str.length();i++)
//			{
//				if(ch==str.charAt(i))
//				{
//					System.out.println(ch+" is in "+(i+1)+" position ");
//					break;
//				}
//			}
//		}
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i)+" is in "+(i+1)+" position");
		}
		
		
	}

}
