package com.StringProgramme;

public class WhichElementHasMaxLength {

	public static void main(String[] args) {
		String[] a= {"131242", "23", "12434234", "12","12123412"};
		String max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max.length()< a[i].length())
			{
				max=a[i];
			}
		}
		for(int i=0; i<a.length;i++)
		{
			if(max.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
		}

	}

}
