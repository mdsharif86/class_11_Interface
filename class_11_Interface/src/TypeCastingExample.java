
public class TypeCastingExample {

	public static void main(String[] args) {
		
		byte a;
		a = 4;
		
		byte b;
		b = a;
		
		System.out.println(b);
		
		int x;
		x = 34;
		
		byte y;
		y = (byte) x;
		
		System.out.println(y);
		
		//Type conversion
		String itemPrice;
		itemPrice = "34.99";
		
		double p = Double.parseDouble(itemPrice);
		
		System.out.println("price is " + p);  //typer conversion
		
		//String in integer
		String empAge = "50";
		int age = Integer.parseInt(empAge);
		
		System.out.println("Age is " + age);
		
		//Anything to string conversion using toString() method
		double k = 45.89;
		String s = Double.toString(k);
		System.out.println(s);
		
		int i = 456;
		s = Integer.toString(i);
		
		
		float m;
		m = (float) 45.67;  //casting
		m =  45.67f;   // casting
		
		

	}//main

}//class
