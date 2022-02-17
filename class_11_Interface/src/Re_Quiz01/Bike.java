package Re_Quiz01;

public class Bike {
	int gear;
	int speed;
	
	void changeGear(int gear) {
		this.gear = gear;
	}
	void speedUp(int speed) {
		this.speed += speed;
	}
	 void applyBrakes(int brake) {
		 this.speed -= brake;
	 }
	 void display() {
		System.out.println("Bike present state: ");
		System.out.println("updated gear of Bike: " + this.gear);
		System.out.println("updated speed of Bike : " + this.speed);
	 }
}