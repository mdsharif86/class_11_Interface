package Re_Quiz01;

public class bicycle implements Vehicle {
	int gear;
	int speed;

	@Override
	public void changeGear(int gear) {
		this.gear = gear;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void applyBrakes(int speed) {
		this.speed -= speed;
	}
	
	void display() {
		System.out.println("Bicycle present state :\n" + "Updated gear of Bicycle: " + this.gear + "\nUpdated speed of Bicycle: " + this.speed);
	}

}
