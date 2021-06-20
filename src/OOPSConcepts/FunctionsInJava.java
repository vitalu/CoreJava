package OOPSConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is reference variable, referring to this object
		// after creating the object , the copy of all non-static methods will be given to the object
		obj.test();
		int a = obj.add();
		System.out.println(a);
		String s1 = obj.Qa();
		System.out.println(s1);
		int div = obj.div(10, 2);
		System.out.println(div);

	}
	
	// non -static methods
	
	//void - does not retrun any value
	//return type - void
	public void test() {//no input, no output
		System.out.println("Test method");
		
	}
	//retrun type- int
	public int add() {//no input, some output
		System.out.println("Add method");
		int a=10;
		int b= 20;
		int c = a+b;
		return c;
	}
	
	//return type- String
	public String Qa() {
		System.out.println("QA method");
		String s = "Hello";
		return s;
	}
	
	//return type int
	//x,y input parameters
	public int div(int x, int y) {//
		int d = x/y;	
		
		return d;
	}

}
