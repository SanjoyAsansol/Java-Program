package com.practice;

public class SortAnArrayInAscendingOrder {

	public static void main(String[] args) {
		int[] a= {2,3,9,6,5,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(Integer k:a)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("================================");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("================================");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
