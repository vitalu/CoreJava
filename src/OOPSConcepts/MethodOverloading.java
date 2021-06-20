package OOPSConcepts;

//If a class having same method name with different arguments/input parameters is called Method Overloading
public class MethodOverloading {
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.overloading();
		mo.overloading("Kiran");
		mo.overloading("Ramesh", 30);
	}
	
	public void overloading() {
		System.out.println("Method overloading with Zero parameters");
	}
	public void overloading(String s) {
		System.out.println("Method overloading with one parameter");
		System.out.println(s);
	}
	public void overloading (String name, int age) {
		System.out.println("Method overloading with two parameter");
		System.out.println(name);
		System.out.println(age);
	}
	

}
