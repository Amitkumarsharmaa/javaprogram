package javaprogram;

class PolyDemo
{
	int a=10;
	
	int sum()
	{
		System.out.println("PolyDemo.sum()1");
		return a+20;
	}
	
	int sum(int n)
	{
		System.out.println("PolyDemo.sum()2");
		return a+n;
	}
	int sum(int n,int n2)
	{
		System.out.println("PolyDemo.sum()3");
		return n +n2;
	}
	int sum(int n1,int n2 ,int n3)
	{
		System.out.println("PolyDemo.sum()4");
		return n1+n2+n3;
	}
	float sum(int n,float n2)
	{
		System.out.println("PolyDemo.sum()5");
		return n +n2;
	}
	float sum(float n,float n2)
	{
		System.out.println("PolyDemo.sum()6");
		return n +n2;
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		PolyDemo anshul = new PolyDemo();
		System.out.println(anshul.sum());
		System.out.println(anshul.sum(10));
		System.out.println(anshul.sum(10,20));
		System.out.println(anshul.sum(10,20,30));
		System.out.println(anshul.sum(10,3.14f));
		System.out.println(anshul.sum(10.1f,3.14f));
	}
}