package javaprogram;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Number - ");
	       int n = sc.nextInt();
	        System.out.println("Number");
	     
	        	   
	        	    // outer loop
	        	    for (int i = 0; i < n; i++) {
	        	      // inner loop
	        	      for (int j = 0; j < n; j++) 
	        	      {
	        	        if (i == 0 || i == n - 1) {
	        	          System.out.print("*");
	        	        }
	        	        else {
	 	        	          if (j == 0 || j == n - 1) {
	        	            System.out.print("*");
	        	          }
	        	          else {
	        	            System.out.print(" ");
	        	          }
	        	        }
	        	      }
	        	      System.out.println();
	        	    }
	        	  }
	        	}