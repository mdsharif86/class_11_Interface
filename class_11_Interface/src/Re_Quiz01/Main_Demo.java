package Re_Quiz01;

public class Main_Demo {

	public static void main(String[] args) {
		
		bicycle obj;
		obj = new bicycle();
		
		obj.gear = 1;
		obj.speed = 50;
		obj.changeGear(2);
		obj.speedUp(50);
		obj.changeGear(3);
		obj.applyBrakes(50);
			
		obj.display();
		
		Bike yamaha;
		yamaha = new Bike();
		yamaha.gear = 2;
		yamaha.changeGear(4);
		yamaha.speedUp(40);
		yamaha.applyBrakes(20);
		yamaha.changeGear(5);
		yamaha.speedUp(100);
		
		yamaha.display();
	}

}
