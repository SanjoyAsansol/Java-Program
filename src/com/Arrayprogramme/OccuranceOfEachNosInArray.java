package com.Arrayprogramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfEachNosInArray {

	public static void main(String[] args) {
		int[] a= {2,3,2,1,0,3};
//		for(int i=0; i<a.length;i++)
//		{
//			int count=0;
//			int num1=a[i];
//			for(int j=0; j<a.length;j++)
//			{
//				int num2=a[j];
//				if(num1==num2 & i>j)
//				{
//					break;
//				}
//				if(num1==num2)
//				{
//					count++;
//				}
//			}
//			if(count>1)
//			{
//				System.out.println(num1+" present "+count+" times");
//			}
//		}
//
		System.out.println("=================Using HashSet ==============================");
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for(int i=0; i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte: set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					count++;
				}
			}
		System.out.println(inte+" present "+count+" Times ");
		}
	}
}
