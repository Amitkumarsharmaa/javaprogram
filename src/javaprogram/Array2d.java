package javaprogram;
import java.util.Iterator;

public class Array2d {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 6, 30, 7, 2, 4 };
//		int even_count = 0, odd_count = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				even_count++;
//			}else {
//				odd_count++;
//			}
//		}
//		
//		
//		System.out.println("Total even are: "+even_count);
//		System.out.println("Total odd are: "+odd_count);
//		System.out.println("Before replacing........");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=arr[i]*arr[i];
//		}
//		System.out.println();
//		System.out.println("After replacing........");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		int temp=0,j=arr.length-1;
		
		System.out.println("Before swapping........");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length/2; i++,j--) {
			temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		}
		System.out.println();
		System.out.println("After swapping........");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
