package com.Arrayprogramme;

public class Find1stAnd2ndMinArrayWithoutBB {

	public static void main(String[] args) {
	int[] a= {9,5,2,0,3,1}; //O/P-->1 2 			
	int fmin=a[0];//0
	int smin=a[0];//0
	//0 1 2
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<=fmin)
		{
			if(a[i]!=fmin)
			{
				smin=fmin;
			}
			fmin=a[i];
		}
		else if(fmin==smin || smin>a[i])
		{
			smin=a[i];
		}
	}
	System.out.println(fmin+"  "+smin);
	}
}