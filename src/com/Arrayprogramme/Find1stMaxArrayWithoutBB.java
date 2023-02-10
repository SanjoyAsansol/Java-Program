package com.Arrayprogramme;

public class Find1stMaxArrayWithoutBB {

	public static void main(String[] args) {
		int[] a= {5,9,0,2,1,3,4};
		//int min=a[0];
		int max= a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum no in the array is : "+max);
		
		
	}
}

