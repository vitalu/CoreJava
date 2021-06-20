package Inheritance;

public class BankTest {

	public static void main(String[] args) {
		SBI s=new SBI();  
		HDFC h = new HDFC();
		Kotak k = new Kotak();
		
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("HDFC Rate of Interest: "+h.getRateOfInterest());  
		System.out.println("Kotak Rate of Interest: "+k.getRateOfInterest());  

	}

}
