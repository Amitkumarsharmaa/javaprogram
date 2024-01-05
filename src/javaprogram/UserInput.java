package javaprogram;
	import java.util.Scanner;
	public class UserInput {
		public static void main(String[] args) {
			System.out.println("Hello Java");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name: ");
//			String name = sc.nextLine();
			
//			System.out.println("Your name is: "+name);
//			int n = sc.nextInt();
//			float f = sc.nextFloat();
//			System.out.println(f);
			char ch = sc.next().charAt(0);
			System.out.println(ch);
		}
	}