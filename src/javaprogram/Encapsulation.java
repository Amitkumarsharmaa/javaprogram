package javaprogram;
class Student
{
	private String name;
	private String address;
	private int rollNo;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setId(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Student mihir = new Student();
		mihir.setName("Mihir");
		mihir.setAddress("Noida");
		mihir.setId(101);
		
		System.out.println(mihir.getName());
		System.out.println(mihir.getAddress());
		System.out.println(mihir.getRollNo());
	}
}

