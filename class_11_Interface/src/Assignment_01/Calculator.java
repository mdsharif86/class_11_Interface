package Assignment_01;

public class Calculator implements Calculations {
	int a;
	int b;
	@Override
	public void addition(int a, int b) {
//		this.a = a;
//		this.b = b;
		System.out.println("Addition of a and b: " + (a + b));
	}
	@Override
	public void subtraction(int a, int b) {
		System.out.println("Subtraction of a and b: " + (a - b));
	}
	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiply of a and b: " + (a * b));
		
	}
	@Override
	public void division(int a, int b) {
		System.out.println("Division of a and b: " + (a / b));
	}
	
	
}
