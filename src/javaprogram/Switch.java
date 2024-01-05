package javaprogram;

import java.util.Scanner;

	public class Switch {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an alpha: ");
			char ch = sc.next().charAt(0);
			
			
			switch(ch)
			{
			case 'A':System.out.println(ch+" is vowel");
			break;
			case 'E':System.out.println(ch+" is vowel");
			break;
			case 'I':System.out.println(ch+" is vowel");
			break;
			case 'O':
			System.out.println(ch+" is vowel");
			break;
			case 'U':System.out.println(ch+" is vowel");
			break;
			default: System.out.println(ch+" is consonent");
			}
		}
	}