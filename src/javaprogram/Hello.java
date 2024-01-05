package javaprogram;

		public class Hello {
			float pi;// Instance variable
			String name;
			static int age;

			void show() {
				int x = 10; // local variable
				System.out.println(name);
				System.out.println(age);
				System.out.println(pi);

			}
			static void disp()
			{
				System.out.println("Static block- "+age);
			}
			public static void main(String args[]) {
				Hello.age=25;
				Hello.disp();

//				Hello ref;// reference variable
//				ref = new Hello();// object / Instance
//				ref.name = "Rupesh";
//				Hello.age = 24;
//				ref.pi = 3.14f;
		//
//				ref.show();
//				Hello obj = new Hello();
//				obj.show();
//				Hello obj2 = new Hello();
//				obj.show();
			}

		}