package OOPSConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		String a = "10";
		System.out.println(a+20);
		
		int i =Integer.parseInt(a);
		System.out.println(i+20);
		
		//double conversion
		String b = "20.11";
		double d = Double.parseDouble(b);
		System.out.println(d+1.4);
		
		//boolean conversion
		String c = "true";
		boolean p = Boolean.parseBoolean(c);
		System.out.println(c);
		
		//int to String conversion
		int j =200;
		String n = String.valueOf(j);
		System.out.println(n);
				
			

	}

}
