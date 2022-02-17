package Assignment_03;

public class Square implements Shape {

	private double length;

	void setLength(double length) {
		this.length = length;
	}

	double getLength() {
		return this.length;
	}

	@Override
	public double getArea() {
		return (this.length * this.length);
	}

	@Override
	public double getPermiter() {
//		return (4 * this.length);
		return (this.length + this.length + this.length + this.length);
	}

}
