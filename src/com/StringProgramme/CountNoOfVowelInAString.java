package com.StringProgramme;

public class CountNoOfVowelInAString {

	public static void main(String[] args) {
		String s= "TestYantra".toLowerCase();// eaa
		int vcount=0;
//		for(int i=0; i<s.length();i++)
//		{
//			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//			{
//				vcount++;
//			}
//				
//		}
//		System.out.println(vcount);
		char[] st = s.toCharArray();
		for(int i=0;i<st.length;i++)
		{
			if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
			{
				vcount++;
				System.out.print(st[i]);
			}
		}
		System.out.println();
		System.out.println("Vowel count is : "+vcount);

	}

}
