package OOPSConcepts;

public class StaticandNonStaticConcepts {
	//Global variables -- the scope of global variables will be available across with all the functions with some condition
	String name = "Ramesh";
	static int salary = 30000;

	public static void main(String[] args) {
		//1. calling static method directly
		emp(salary);
		//2. calling static method name using classname
		StaticandNonStaticConcepts.emp(salary);
		//calling non static methods and variables
		StaticandNonStaticConcepts obj = new StaticandNonStaticConcepts();
		obj.add();
		System.out.println(obj.name);
		
		//can I access static method by using object reference. yes but warning will be given but this is not best practice in Java
		obj.emp(25000);

	}
	public void add() { // non static metho
		System.out.println("add method");
	}
	public static void emp(int salary) { //static method
		System.out.println("Employee method");
		System.out.println(salary);
	}

}
