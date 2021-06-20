package OOPSConcepts;

public class Car {
	String name;
	int model;

	public static void main(String[] args) {
		//new Car(); is an Object of Car class
		//a,b are the Object reference variables
		Car a = new Car();
		Car b = new Car();
		
		a.name = "Volkswagen Polo";
		a.model = 2020;
		
		b.name = "Hyndai Verna";
		b.model = 2021;
		
		
		System.out.println(a.name);
		System.out.println(b.name);

	}

}
