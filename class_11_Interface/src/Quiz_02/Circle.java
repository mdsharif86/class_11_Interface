package Quiz_02;

public class Circle implements Shape {
	private double radius;

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return this.radius;
	}

	@Override
	public double getArea() {
		return (Math.PI * (this.radius * this.radius));
	}

	@Override
	public double getPerimeter() {
		return (2 * Math.PI * this.radius);
	}
}