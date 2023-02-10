package com.Arrayprogramme;

public class AppendDifferntNoOnFirst {

	public static void main(String[] args) {
		int[] a= {7,0,0,9,0};// op 0 0 0 1 1
		int[] b= new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==1)
			{
			b[n]=a[i];
			n--;
			}
			else
			{
			b[m]=a[i];
			m++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
//////Demo.... Not complete

	}

}
