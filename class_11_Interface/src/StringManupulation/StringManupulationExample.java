package StringManupulation;
import java.util.Scanner;

public class StringManupulationExample {

	public static void main(String[] args) {
		
		Scanner scn;
		scn = new Scanner(System.in);
		
		System.out.println("Enter your password: ");
		String password = scn.nextLine();
		
		if( password.length()>=8)
		System.out.println("1 condition is ok");
		
		else
			System.out.println("password must be 8 character long");
		
		System.out.println(" you wrote this:" + password);
		
		scn.close();
	}

}
