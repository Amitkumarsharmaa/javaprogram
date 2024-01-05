package javaprogram;
import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		int abc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n = sc.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				abc++;
				break;
			}
		}

		if (abc == 0) {
			System.out.println("Right");
		} else {
			System.out.println("Wrong");
		}
	}
}