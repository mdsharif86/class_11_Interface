package Assignment_03;

public class Rectangle implements Shape {

	private double length;
	private double width;

	void setLength(double length) {
		this.length = length;
	}

	double getLength() {
		return this.length;
	}

	void setWidth(double width) {
		this.width = width;
	}

	double getWidth() {
		return this.width;
	}

	public double getArea() {
		return (this.length * this.width);
	}

	public double getPermiter() {
		return (2 * (this.length + this.width));
	}

}
