package com.Arrayprogramme;

public class FindTheFirstMinNoInArrayUsingBB {

	public static void main(String[] args) {
	int[] a= {5,2,1,0,3};	
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
	System.out.println("1st Minimum : "+a[0]);
	System.out.println("2nd Minimum : "+a[1]);
	System.out.println("2nd Maximum : "+a[2]);
	System.out.println("1st Maximum : "+a[a.length-1]);
	

	}

}
