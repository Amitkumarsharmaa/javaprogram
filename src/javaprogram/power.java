package javaprogram;

import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
	System.out.println(" Enter Number : ");		
		int n=sc.nextInt();
		System.out.println(" Power : ");	
		int n1=sc.nextInt();
		int res=n;
		for(int i=1;i<n1;i++) {
			res=res*n;
		}
				System.out.println(res) ;

		}
	}
	

