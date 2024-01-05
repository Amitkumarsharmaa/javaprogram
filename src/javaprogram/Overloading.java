package javaprogram;

class AnimalPro {
	void sleep() {
		System.out.println("I can sleep.....");
	}

	void eat() {
		System.out.println("I can Eat veg and non-veg both.....");
	}

	void run() {
		System.out.println("I can run...........");
	}
}
class Cow extends AnimalPro
{
	@Override
	void eat() {
		System.out.println("I can Eat veg only.....");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Cow ganga = new Cow();
		
		ganga.eat();
		ganga.sleep();
		ganga.run();
	}
}




























