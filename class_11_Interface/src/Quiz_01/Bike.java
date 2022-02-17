package Quiz_01;

public class Bike implements Vehicle {
	int gear;
	int speed;
	@Override
	public void changeGear(int gear) {
		this.gear = gear;
	}
	@Override
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	@Override
	public void applyBrakes(int brake) {
		this.speed-=brake;
	}
	
	void display() {
		System.out.println("Bike present state :\n" +  "Updated Gear of bike:" + this.gear + "\nUpdated Speed of bike:" +  this.speed);
	}
	


}
