package javaprogram;
class Testing
{
	String name;
	static String gender;
	int id;
	
	Testing(String name,String gender,int id)
	{
		this.name=name;
		this.gender=gender;
		this.id=id;
	}
	
	static int sum()
	{
		show(ram);
		disp();
		System.out.println(name);
		System.out.println(gender);
		return 10+20;
	}
	
	static void disp()
	{
		System.out.println("Testing.disp()");
	}
	void show()
	{
		System.out.println("Testing.show()");
	}
	void print()
	{
		show();
		sum();
		System.out.println(name);
		System.out.println(gender);
		System.out.println(id);
	}
	
}
public class Staticnonstatic {
	public static void main(String[] args) {
	
	}
}

