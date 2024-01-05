package javaprogram;

	public class Looping {
		public static void main(String[] args) {
			int a =10,b=30;
			if(a>b)
			{
				System.out.println("A is max");
			}
			else
			{
				System.out.println("B is max");
			}
			int max = (a>b)?a:b;
			System.out.println("Max is: "+max);
//			 (a>b) ?   : System.out.println("B is max");
			int number=-1;
			String msg=(number == 0) ? "Zero" : ((++number > 0) ? ((number==2)? "w":"q") : "Negative");
			System.out.println(msg);
			System.out.println(number);
		}
	}
