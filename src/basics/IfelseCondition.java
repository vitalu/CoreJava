package basics;

public class IfelseCondition {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(b>a)
		{
			System.out.println("b is greatest");
		}else
		{
			System.out.println("a is greatest");
		}
		int a1= 500;
		int b1= 900;
		int c1= 300;
		
		if(a1>b1&a1>c1)
		{
			System.out.println("a1 is greatest");
			
		}else if(b1>c1)
		{
			System.out.println("b1 is greatest");
		}else
		{
			System.out.println("c1 is greatest");
		}

	}

}
