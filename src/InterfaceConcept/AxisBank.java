package InterfaceConcept;

public class AxisBank implements USBank, RBIBank {

	@Override
	public void internetBanking() {
		System.out.println("Axis Bank--internetBanking");
		
	}

	@Override
	public void atmCharges() {
		System.out.println("Axis Bank--ATM charges");
		
	}

	@Override
	public void credit() {
		System.out.println("Axis Bank--credit");
		
	}

	@Override
	public void debit() {
		System.out.println("Axis Bank--debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("Axis Bank--Money transfer");
		
	}
	public void axisCustomerSupport() {
		System.out.println("Axis Bank--Customer Support");
	}
	public void axisBankROI() {
		System.out.println("Axis Bank--Rate of Interest is 6%");
	}
	public static void main(String[] args) {
	System.out.println(USBank.minBalance);
	AxisBank ab = new AxisBank();
	ab.internetBanking();
	}
}
