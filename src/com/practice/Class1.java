package com.practice;
public class Class1 {
public static void main(String[] args) {
	int[] a= {5,9,2,1,3,4};
	
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1; i<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int k=0; k<a.length;k++)
	{
		System.out.print(a[k]+" ");
	}
	}
}


