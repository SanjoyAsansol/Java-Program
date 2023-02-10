package com.practice;

public class First3MinimumInAnArray {

	public static void main(String[] args) {
	int a[]= {2,5,9,7,0,16};
	for(int i=0; i<a.length;i++)
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
	for(int k=0; k<3;k++)
	{
		System.out.println("First 3 Minimum no In Array : -->"+a[k]+" ");
	}
	System.out.println();
	for(int k=a.length-1;k>a.length-4;k--)
	{
		System.out.print(a[k]+" ");
	}

	}

}
