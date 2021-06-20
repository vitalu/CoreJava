package OOPSConcepts;

public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setSsn(22533);
		obj.setEmpName("Ramesh Ch");
		obj.setEmpAge(25);
		obj.setCity("Vishakhapatnam");
	
		System.out.println("Employee SSN: "+obj.getSsn());
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee Age: "+obj.getEmpAge());
		System.out.println("Employee City: "+obj.getCity());
		

	}

}
