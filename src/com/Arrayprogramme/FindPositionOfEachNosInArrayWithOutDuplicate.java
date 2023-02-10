package com.Arrayprogramme;

import java.util.LinkedHashSet;

public class FindPositionOfEachNosInArrayWithOutDuplicate {

	public static void main(String[] args) {
//		int[] a= {2,3,2,1,0,3};
//		for(int i=0; i<a.length;i++)
//		{
//			int count=0;
//			int num1= a[i];
//			for(int j=0; j<a.length;j++)
//			{
//				int num2= a[j];
//				if(num1==num2 && i>j)
//				{
//					break;
//				}
//				if(num1==num2)
//				{
//					count++;
//				}
//			}
//			if(count==1)
//			{
//			System.out.println(a[i]+" is in "+(i+1)+" position ");
//			}
//		}
		System.out.println("=====================Using Hash Map=========================");
		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			for(int i=0; i<a.length;i++)
			{
				if(inte==a[i])
				{
					System.out.println(inte+" is in "+(i+1)+" position");
					break;
				}
			}
		}

	}

}
