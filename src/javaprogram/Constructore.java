package javaprogram;

class Doggy {
	private String name;
	private String color;
	private int age;

	// Default COnstructor
	public Doggy() {
		name = "Zozo";
		color = "black";
		age = 15;
		System.out.println("default-called....");
	}
	// Parameterized called
	public Doggy(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("Param-called....");
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}

}

public class Constructore {
	public static void main(String[] args) {
		Doggy zozo = new Doggy();
		zozo.print();
		
		Doggy pozo = new Doggy();
		pozo.print();

		Doggy shimbha = new Doggy("SHimbha", "green", 20);
		shimbha.print();
		
	}
}

