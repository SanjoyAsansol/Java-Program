package com.Arrayprogramme;

public class FindTheSumOf1st3MaxNoInArray {
	
	public static void main(String[] args) {
		int[] a= {5,2,3,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//System.out.println("Sum of first 3 min no is : "+(a[0]+a[1]+a[2]));
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of first 3 Max no is :"+sum);

	}

}
