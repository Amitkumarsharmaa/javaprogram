package javaprogram;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
//		i= new int [3] ;
		arr= new int[5] ;
//		arr[0]= 2;
//		arr[1]= 4;
//		arr[2]= 8;
		int sum=1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum=sum*arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("Addition is: "+sum);
		
		
		
		
	}
}