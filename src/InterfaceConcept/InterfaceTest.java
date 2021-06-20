package InterfaceConcept;

public class InterfaceTest {

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.credit();
		ab.debit();
		ab.atmCharges();
		ab.internetBanking();
		ab.transferMoney();
		
		ab.axisBankROI();
		ab.axisCustomerSupport();
		
		System.out.println(USBank.minBalance);

	}

}
