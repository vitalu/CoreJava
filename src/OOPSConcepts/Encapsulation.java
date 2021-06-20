package OOPSConcepts;

public class Encapsulation {
	//Encapsulation is called data hiding

	//1. Private data variables: these variables can not be accessed outside the class
	private int ssn;
	private String empName;
	private int empAge;
	private String City;
	

	//public getter and setter methods: to get and set values of the fields.
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

}
