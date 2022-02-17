package Quiz_01;

public class Main_Class {

	public static void main(String[] args) {

		Bicycle obj;
		obj = new Bicycle();
		
		obj.gear= 1;
		obj.changeGear(3);
		obj.speed = 30;
		obj.speedUp(20);
		obj.applyBrakes(10);
		obj.display();
		
		System.out.println();
		
		Bike yamaha;
		yamaha = new Bike();
		yamaha.gear = 2;
		yamaha.speed = 40;
		yamaha.changeGear(5);
		yamaha.speedUp(50);
		yamaha.applyBrakes(20);
		yamaha.display();
		
	}// main

}// class