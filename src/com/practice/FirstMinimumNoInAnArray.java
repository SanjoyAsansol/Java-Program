package com.practice;

public class FirstMinimumNoInAnArray {

	public static void main(String[] args) {
		int a[]= {3,6,1,2,9,7};
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("1st Minimum : "+a[0]);
		System.out.println("2nd Minnimum :"+a[1]);
		System.out.println("1st Maximum : "+a[a.length-1]);
		System.out.println("2nd Maximum is : "+a[a.length-2]);
		

	}

}
