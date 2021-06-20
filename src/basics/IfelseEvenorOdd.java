package basics;

public class IfelseEvenorOdd {

	public static void main(String[] args) {
		int a = 20;
		
		if(a%2==0)
		{
			System.out.println("Even number");
		}else
		{
			System.out.println("Odd number");
		}

		//Leap year
		int year=2021;    
	    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");  
	    }  
	    else{  
	        System.out.println("COMMON YEAR");  
	    }  
	    
	    //if else if ladder
	    
	    double m=90.1;
	    if(m<50) 
	    {
	    	System.out.println("Fail");
	    }else if (m>=50 && m<60)
	    {
	    	System.out.println("D grade");
	    }else if (m>=60 && m<70)
	    {
	    	System.out.println("C grade");
	    }else if (m>=70 && m<80)
	    {
	    	System.out.println("B grade");
	    }else if (m>=80 && m<90)
	    {
	    	System.out.println("A grade");
	    }else if (m>=90 && m<100)
	    {
	    	System.out.println("A+ grade");
	    }else
	    {
	    	System.out.println("Invalid");
	    }
	}

}
