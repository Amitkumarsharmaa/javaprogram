package javaprogram;

interface JavaInter {
	public static final int id = 101;

	public abstract void print();
}

interface Java2 extends JavaInter {
	public int sum();
	
	public static void oddEven(int n)
	{
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	
	public default void max(int a, int b)
	{
		if(a>b)
		{
			System.out.println("A is max");
		}else {
			System.out.println("B is max");
		}
	}
}

class implementedClass implements Java2 {

	@Override
	public void print() {
		System.out.println("implementedClass.print()");
	}

	@Override
	public int sum() {
		return 10 + 10;
	}

}

public class Interface {

	public static void main(String[] args) {
		// upcasting
		Java2 ref = new implementedClass();
//		JavaInter.id=20;
		System.out.println(JavaInter.id);
		ref.print();
		System.out.println("Sum is : " + ref.sum());
		Java2.oddEven(20);
		ref.max(10, 20);
	}

}