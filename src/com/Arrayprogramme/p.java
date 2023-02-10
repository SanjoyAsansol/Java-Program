package com.Arrayprogramme;

import java.util.LinkedHashSet;

public class p {

public static void main(String[] args) {
	String[] a = {"asd","db","qddqwdq","ab","abcdefg"};
	String min = a[0];
	for(int i=0; i<a.length;i++)
	{
		if(min.length()>a[i].length())
		{
			min=a[i];
			}
	}
	for(int i=0; i<a.length;i++)
	{
		if(min.length()==a[i].length())
		{
			System.out.println(a[i]);
		}
	}
}
}
