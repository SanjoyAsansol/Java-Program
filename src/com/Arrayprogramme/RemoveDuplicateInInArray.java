package com.Arrayprogramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInInArray {

	public static void main(String[] args) {
		int[] a= {2,3,2,2,0,3};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for(int i=0; i<a.length;i++)
		{
			set.add(a[i]);
		}
		//System.out.println(set);
		for(Integer inte:set)
		{
			System.out.print(inte+" ");
		}
//	for(int i=0; i<a.length;i++)
//	{
//		int count=0;
//		for(int j=0;j<a.length;j++)
//		{
//			if(a[i]>a[j])
//			{
//				count++;
//			}
//			if(a[i]==a[j])
//			{
//				break;
//			}
//		}
//	}
	
	}
		
		

}
