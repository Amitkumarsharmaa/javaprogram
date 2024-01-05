package javaprogram;
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int m = sc.nextInt();
		
		if(m<=100 && m>=90)
		{
			System.out.println("A+ grade");
		}
		else if(m<=89 && m>=70)
		{
			System.out.println("B+ grade");
		}
		else
		{
			System.out.println("C+ grade");
		}
	}
}


//marks --> 90-100--> A+ Grade
//marks --> 70-89--> B+ Grade
//marks --> 60-69--> First Div
//marks --> 33-59--> Just pass
//marks --> 0-32--> Fail
//Otherwise ---> Invalid marks
//Bill Calculator:
//
//u--> 1-100 --> 2 rs/unit
//u--> 100-200 --> 5 rs/unit
//u--> 200-300 --> 7 rs/unit
//u--> 300-400 --> 10 rs/unit
//u--> 400-500 --> 12 rs/unit
//unit>500 -->15rs / unit
///*
