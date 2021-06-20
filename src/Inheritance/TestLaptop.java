package Inheritance;

public class TestLaptop {

	public static void main(String[] args) {
		HPNotebook hp = new HPNotebook();
		hp.chipModel();
		hp.fatherOfLaptop();
		
		MacbookPro mac = new MacbookPro();
		mac.cost();
		mac.fatherOfLaptop();
		
		Laptop lp = new Laptop();
		lp.fatherOfLaptop();
		lp.yearOfManfacturer();
		
		
		
		Laptop l = new HPNotebook();// child class object can be referred by parent class reference variable --Dynamic Polymorphism or Run time Polymorphism
		l.chipModel();
		l.fatherOfLaptop();
		
		Laptop l1= new MacbookPro();
		l1.chipModel();
		l1.yearOfManfacturer();
		l1.operatingSystem();
		l1.fatherOfLaptop();
		
		
	}

}
