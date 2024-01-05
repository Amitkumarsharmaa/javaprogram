package javaprogram;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Number : ");
		int n=sc.nextInt();
		for(int i=n-1;i>=1;i--)
		{
			n=n*i;
		}
		System.out.println(""+n); 
	}
}
