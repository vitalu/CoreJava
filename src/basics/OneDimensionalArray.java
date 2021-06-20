package basics;

public class OneDimensionalArray {

	
	public static void main (String[] args) {
		
		//int array
		int i[] = new int[5];
		i[0] = 2;
		i[1] = 50;
		i[2] = 20;
		i[3] = 30;
		i[4] = 40;
		System.out.println(i.length);
		System.out.println(i[3]);
		
		//double array
		double d[] = new double[3];
		d[0] = 1.23;
		d[1] = 3.45;
		d[2] = 9.33;
		System.out.println(d.length);
		System.out.println(d[1]);
		
		//char array
		char c[] = new char[4];
		c[0] = 'h';
		c[1] = '1';
		c[2] = 'm';
		c[3] = '4';
		System.out.println(c.length);
		System.out.println(c[3]);
		
		//boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b.length);
		System.out.println(b[1]);
		
		//String array
		String s[] = new String[4];
		s[0] = "Hello";
		s[1] = "this";
		s[2] = "is";
		s[3] = "array";
		System.out.println(s.length);
		System.out.println(s[3]);
		
		//Object array
		Object obj[] = new Object[5];
		obj[0]="Vital";
		obj[1]=30;
		obj[2]= 'A';
		obj[3]= 4.3;
		obj[4]= true;
		System.out.println(obj.length);
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);
		
		
		
		
	}
}
