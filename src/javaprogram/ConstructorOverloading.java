package javaprogram;

class Human {
	
	public Human(String name,String gender)
	{
		this(33);
		this.name=name;
		this.gender=gender;
		System.out.println("2 param-called...");
	}
	public Human(String name,String gender,int age)
	{
		this(name,gender);
		System.out.println("3 param-called...");
	}
	String name;
	String gender;
	int age;

	public Human() {
		name = "Varsha";
		gender = "Female";
		age = 12;
		System.out.println("Default-called...");
	}
	
	public Human(int age)
	{
		this();
		this.age=age;
		System.out.println("1 param-called...");
	}
	

	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Human varsha = new Human("Paliwal","male",90);
		System.out.println(varsha);
		
	}
	
	String name;
	String gender;
	int age;
}