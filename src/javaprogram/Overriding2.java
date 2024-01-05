package javaprogram;

class AnimalPro5 {
	void sleep() {
		System.out.println("I can sleep.....");
	}

	 void ate() {
		System.out.println("I can Eat veg and non-veg both.....");
	}

	void run() {
		System.out.println("I can run...........");
	}
}
class Cow4 extends AnimalPro5
{
	@Override
	void ate() {
		System.out.println("I can Eat veg only.....");
	}
}
public class Overriding2 {
	public static void main(String[] args) {
		Cow4 ganga = new Cow4();
		
		boolean b=ganga instanceof Cow4;
		
		System.out.println(b);
		
//		ganga.eat();
//		ganga.sleep();
//		ganga.run();
//		
//		final int x=10;
//		int y=x;
		
		
	}
}