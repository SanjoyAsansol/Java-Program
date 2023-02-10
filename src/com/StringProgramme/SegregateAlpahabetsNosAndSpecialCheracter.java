package com.StringProgramme;

import java.util.Scanner;

public class SegregateAlpahabetsNosAndSpecialCheracter {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		String s=sc1.next();
		//String s="a#f2$v!5^";// afv 325 $!^
		String alpha="";
		String num=" ";
		String sc=" ";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'|| s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else {
				sc=sc+s.charAt(i);
			}

	}
		System.out.print(alpha+num+sc);

}
}
