package com.StringProgramme;

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="b2v4d6";
		//char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n= s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
				
				
//		int sum=0;
//		for(int i=0; i<ch.length;i++)
//		{
//			if(ch[i]>='0' && ch[i]<='9')
//			{
//				sum=sum+(ch[i]-48);//ascii value of number start from 48 to 57
//				
//			}
//		}
//		System.out.println(sum);

//

