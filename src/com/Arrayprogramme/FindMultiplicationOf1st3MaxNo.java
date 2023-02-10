package com.Arrayprogramme;

public class FindMultiplicationOf1st3MaxNo {

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
		for(int k=0; k<a.length;k++)
		{
			System.out.print(+a[k]+" ");
		}
		//System.out.println("Sum of first 3 min no is : "+(a[0]+a[1]+a[2]));
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul=mul*a[i];
		}
		System.out.println("Mul of first 3 Max no is :"+mul);

	}

		
	}


