package javaprogram;

class Animal
{
	String name;
	public String gender;
	private int age;
	protected int id;
	public Animal(String name, String gender, int age, int id) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		System.out.println("Animal.Animal()");
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
	}
}

class Tiger extends Animal
{
	int i;

	public Tiger(String name, String gender, int age, int id,int i) {
		super(name, gender, age, id);
		this.i=i;
		System.out.println("Tiger.Tiger()");
		
	}
	
	
	
	
}


class cub extends Animal
{

	public cub(String name, String gender, int age, int id) {
		super(name, gender, age, id);
		System.out.println("cub.cub()");
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
//		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
		System.out.println("I :"+i);
	}
}



public class Inheritance {
	public static void main(String[] args) {
//		Animal an = new Animal("Tiger","male",25,1001);
//		an.print();
		cub t = new cub("Tiger","male",25,1001);
		
		t.print();
	}
}