package Quiz_01;

public class Bicycle implements Vehicle {
	int gear;
	int speed;
	@Override
	public void changeGear(int gear) {
		this.gear = gear;
		
	}
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		// this.speed= this.speed + speed
	}
	@Override
	public void applyBrakes(int brake) {
		this.speed-= brake;
		
	}
	
	void display() {
		System.out.println("Bicycle present state :\n" +  "Updated Gear of bicycle:" + this.gear + "\nUpdated Speed of bicycle:" +  this.speed);
	}
	
	


}
