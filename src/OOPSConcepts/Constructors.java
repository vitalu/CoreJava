package OOPSConcepts;

public class Constructors {

	public Constructors() {
		System.out.println("Default constructor");
	}
	public Constructors(int i) {
		System.out.println("One parameter constructor "+i);
	}
	public Constructors(String name, int age) {
		System.out.println("Two parameter constructor "+name);
		System.out.println("Two parameter constructor "+age);
	}
	public Constructors(String name, int age,int sal, String City) {
		System.out.println("multi parameter constructor "+name);
		System.out.println("multi parameter constructor "+age);
		System.out.println("multi parameter constructor "+sal);
		System.out.println("multi parameter constructor "+City);
	}
	
	public static void main(String[] args) {
		Constructors obj = new Constructors();
		Constructors obj1 = new Constructors(10);
		Constructors obj2 = new Constructors("Ramesh",34);
		Constructors obj3 = new Constructors("Arun P",37,34000,"Hyderabad");
		
		

	}

}
