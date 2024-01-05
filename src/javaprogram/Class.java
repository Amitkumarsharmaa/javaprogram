package javaprogram;

		class Car
		{
			//Instance variable
			private String name;
			private String color;
			int model;
			
			
			void print()
			{
				System.out.println("Name: "+name);
				System.out.println("color: "+color);
				System.out.println("model: "+model);
			}
			
			void setter(String name,String color,int model)
			{
				this.name=name;
				this.color=color;
				this.model=model;
			}
			void start()
			{
				System.out.println("Car.start()");
			}
			
			void run()
			{
				System.out.println("Car.run()");
			}
			
			void reverse()
			{
				System.out.println("Car.reverse()");
			}
		}


		public class Class {
			public static void main(String[] args) {
				
				int x;
				Car fortuner;// Reference variable
				fortuner= new Car();// Object / instance
				Car fortuner2;// Reference variable
				fortuner2= new Car();// Object / instance
//				fortuner.name="Fortuner";
//				fortuner.color="Black";
//				fortuner.model=2024;
				fortuner.setter("Fortuner", "black",2024);
				fortuner.print();
//				System.out.println(fortuner.name);
//				System.out.println(fortuner.color);
//				System.out.println(fortuner.model);
				fortuner.start();
				fortuner.run();
				fortuner.reverse();
				
				fortuner2.setter("Fortuner 2.0", "White", 2024);
				fortuner2.print();

				
			}
		}