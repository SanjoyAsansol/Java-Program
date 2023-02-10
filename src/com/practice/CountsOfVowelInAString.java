package com.practice;

public class CountsOfVowelInAString {

	public static void main(String[] args) {
		String s="TestYantra";
		char[] ch =s.toLowerCase().toCharArray();
		int vcount=0;
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] == 'a'|| ch[i] == 'e'|| ch[i] == 'i'|| ch[i] == 'o'|| ch[i] == 'u')
			{
				vcount++;
			}
		}
		System.out.println("Vowel Present in String is : "+vcount);

	}

}
