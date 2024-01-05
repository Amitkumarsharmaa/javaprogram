package javaprogram;
abstract class Mobile3
{
	public abstract void call3();
}

class Smartphone2 extends Mobile3
{
	@Override
	public void call3()
	{
		System.out.println("Smartphone2.call3()");
	}
}
public class Abstract1 {
	public static void main(String[] args) {
//		Mobile2 obj = new Mobile3();
		Mobile3 samsung1 = new Smartphone2();
		samsung1.call3();
	}
}



