package com.Arrayprogramme;

import java.util.Arrays;

public class Find1stMinArrayWithoutBB {

	public static void main(String[] args) {
		int[] a= {5,2,1,3};//OP-> 1
		int fmin=a[0];//assuming 1st no is min =5
		for(int i=1; i<a.length;i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}
		System.out.println("The 1st Min no in Array is : "+fmin);
		

	}

}
