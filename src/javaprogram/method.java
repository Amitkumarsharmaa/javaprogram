package javaprogram;
import java.util.Scanner;
	
public class method {
		public static  void isPrime(int n)
		{
			int t=0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					t = 1;
					break;
				}
			}
			if (t == 0) {
				System.out.println("Prime");
			} else {
				System.out.println("NOt-prime");
			}

		}
		
		
		public int sum(int a, int b)
		{
//			int sum=a+b;
			return a+b;
		}

		public static void main(String[] args) {
			int n;
			Scanner sc= new Scanner(System.in);  
			System.out.print("Enter the Number : ");  
			n=sc.nextInt();
			method obj = new method();
//			method.isPrime(n);
//			int n2 = 11;
			method.isPrime(n);
//			method.isPrime(22);
//			method.isPrime(23);
//			int sum= obj.sum(10,20);
//			
//			System.out.println(sum);
//			System.out.println(method.sum(20, 90));
//			obj.isPrime(15);
//			obj.isPrime(71);
//			obj.isPrime(39);

		}
	}

//	
// public int Armstrong(int n,int a)
//	{
//		int x;
//	if(n!=0)
//	{
//		x=n%10;
//		a=a+(x*x*x);
//		n/=10 ;
//		return Armstrong(n,a);
//	}
//	return a;
//	}
//	public static boolean Armstrong(int num) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	public static void main(String[] arg)
//	{
//
//	int num;
//	Scanner sc= new Scanner(System.in);  
//	System.out.print("Enter the Number : ");  
//	num=sc.nextInt();
//	method A=new method();
//	for(int i=0; i<=num; i++)  
//		//function calling  
//		if(Armstrong(num))  
//		{  
//		System.out.print("Armstrong ");  
//		}  
//		else   
//		{  
//		System.out.print("Not Armstrong "); 
//	}
//	}
//
//}