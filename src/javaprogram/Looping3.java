package javaprogram;

import java.util.Scanner;

public class Looping3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a num");
		int n = sc.nextInt();
		System.out.println("ENter pow");
		int p = sc.nextInt();
		int res=n;
		for (int i = 1; i < p; i++) {
			res=res*n;
		}
		
		System.out.println(res);

		for (int i = 1; i <= 11; i++) {
			System.out.println(i%2);
			if (i % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
//		int n=5,i;
//		for ( i = 1; i <= 5; i++) {
//			System.out.println(n--);
//			System.out.println(i);
//		}
//		System.out.println(n);
//		System.out.println(i);
		
		
		int a =10,b=30,t=0;
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		
	}
}