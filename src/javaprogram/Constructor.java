package javaprogram;
class Dog {
	private String name;
	private String color;
	private int age;
	
	public void setter(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}

}

public class Constructor {
	public static void main(String[] args) {
		Dog zozo = new Dog();

		zozo.setter("Zozo", "Brown", 15);
		zozo.print();

		Dog pozo = new Dog();

		pozo.setter("Pozo", "Brown and black", 15);
		pozo.print();
//		zozo.name="ZOZO";
//		zozo.color="Black";
//		zozo.age=20;
//		
//		System.out.println(zozo.name);
//		System.out.println(zozo.color);
//		System.out.println(zozo.age);
	}
}

