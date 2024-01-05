package javaprogram;
class Animal2 {
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
class Cows extends Animal2
{
	
	void eat(int i) {
		System.out.println("I can Eat veg only....."+i);
	}
}
public class Override {
	public static void main(String[] args) {
		Cows ganga = new Cows();
		
		ganga.eat();
		ganga.eat(10001);
		ganga.sleep();
		ganga.run();
	}
}