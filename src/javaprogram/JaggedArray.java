package javaprogram;

import java.util.Scanner;

public class JaggedArray {
	
	
	
	public static void main(String[] args) {

		int arr[][] = new int[3][];
		int n=10;
		arr[0] = new int[n];
		arr[1] = new int[4];
		arr[2] = new int[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"] ");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}