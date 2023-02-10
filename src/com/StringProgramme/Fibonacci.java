package com.StringProgramme;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No u want fibo");
		int fibolimit = sc.nextInt();
		int f1=0;
		int f2=1;
		int f3;
		for(int i=1; i<=fibolimit; i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
		}
	}	
	
}
