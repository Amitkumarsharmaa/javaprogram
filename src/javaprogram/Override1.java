package javaprogram;

class AnimalPro3 {
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
class Cow3 extends AnimalPro3
{
	@Override
	void ate() {
		System.out.println("I can Eat veg only.....");
	}
}
public class Override1{
	public static void main(String[] args) {
		Cow3 ganga = new Cow3();
		
		ganga.ate();
		ganga.sleep();
		ganga.run();
	}
}