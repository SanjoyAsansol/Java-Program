package com.practice;

public class ReverseAWord {

	public static void main(String[] args) {
		//String s="Good Morning Good Eveneing";
		String s="My Name is Shubham Jain";// subham my name is jain
		String[] str=s.split(" ");
		String rev="";
//		for(int i=str.length-1; i>=0;i--)
//		{
//			rev=rev+str[i]+" ";
//		}
//		System.out.println(rev);
		String temp= str[3];
		str[3]=str[2];
		str[2]=str[1];
		str[1]=str[0];
		str[0]=temp;
		for(String st:str)
		{
			System.out.print(st+" ");
		}
		
		
	}

}
