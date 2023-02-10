package com.Arrayprogramme;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		int[] b= {2,3,4,5,6,8};
		int length= a.length;//5
		if(a.length<b.length)
		{
			length=b.length;//5
		}
		for(int i=0; i<length; i++)
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if(a.length>b.length)
				{
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(b[i]+" ");
				}
			}
			
		}
		
	}

