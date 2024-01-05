package javaprogram;

public class Looping2 {
	public static void main(String[] args) {
		int i, count = 0, n = 17;

		for (i = n; i <= n*10; i+=n) {
			System.out.println(i);
		}
//		for (i = 1; i <= 10; i++) {
//			System.out.println(n*i);
//		}

		// 1 2 4
//		for (i = 1; i <= 100; i++) {// 3
////			System.out.println(i);
//			count++;
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
//		

		System.out.println("Total iterations are: " + count);
	}
}