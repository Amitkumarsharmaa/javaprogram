package javaprogram;

	import java.util.Scanner;

	public class Nestedifb {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your marks:");
			int m = sc.nextInt();
			int a=11, b=22, c=3,d=4;

			if (a > b && a > c && a>d) {
				System.out.println("A max");
			}
			
			if(a > b)
			{
				if(a > c)
				{
					if(a > d)
					{
						System.out.println("Nested-A max");

					}
					
				}
				
			}

//			if (u >= 1 && u <= 100) {
//				System.out.println("Total amm: "+u*2);
//			}
//			else if(u<=200 && u>=100)
//			{
//				System.out.println("Total amm: "+(200+(u-100)*5));
//			}

//			if(m<=100 && m>=90)
//			{
//				System.out.println("A+ grade");
//			}
//			else if(m<=89 && m>=70)
//			{
//				System.out.println("B+ grade");
//			}